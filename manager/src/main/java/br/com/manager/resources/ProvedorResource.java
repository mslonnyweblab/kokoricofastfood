package br.com.manager.resources;

import br.com.manager.basedados.models.Provedor;
import br.com.manager.dto.provedor.CadastroProvedorForm;
import br.com.manager.dto.provedor.ProvedorDTO;
import br.com.manager.dto.provedor.UpdateProvedorForm;
import br.com.manager.services.ProvedorService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/provedor")
public class ProvedorResource {

    @Autowired
    private ProvedorService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ProvedorDTO findById(@PathVariable Integer id) {
        Provedor provedor = service.findById(id);
        return new ProvedorDTO(provedor);
    }

    @HystrixCommand(fallbackMethod = "findAllAlternative")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ProvedorDTO>> findAll(Principal principal) {

//        Objects.nonNull(principal);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("---------------------------------   " + principal + "   -----------------");
        System.out.println("---------------------------------   " + principal.getName() + "   -----------------");
        System.out.println("----------------------------------------------------------------------------");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        System.out.println("DETALHES " + authentication.getDetails());

        if (authentication.isAuthenticated()) {
            Object principal1 = authentication.getPrincipal();
            Object principal2 = authentication.getCredentials();
            Object principal3 = authentication.getAuthorities();
            Object principal4 = authentication.getDetails();


        }

        System.out.println("000");

        List<Provedor> list = service.findAll();
        List<ProvedorDTO> listDto = list.stream().map(ProvedorDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    public ResponseEntity<List<ProvedorDTO>> findAllAlternative(Principal principal) {

        ProvedorDTO pv = new ProvedorDTO();
        pv.setSite("www.click");

        return ResponseEntity.ok().body(Arrays.asList(pv));
    }

    @GetMapping("/principal")
    public Principal getP(Principal principal) {
        return principal;
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ResponseEntity<Page<ProvedorDTO>> findpage(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "dataVencimento") String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction
    ) {
        Page<Provedor> list = service.findPage(page, linesPerPage, direction, orderBy);
        Page<ProvedorDTO> listDto = list.map(ProvedorDTO::new);
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody CadastroProvedorForm cadastroProvedorForm) {
        Provedor provedor = service.cadastraProvedor(cadastroProvedorForm);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(provedor.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable Integer id, @Valid @RequestBody UpdateProvedorForm updateProvedorForm) {

        System.out.println(updateProvedorForm);
        service.updateProvedor(updateProvedorForm);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
//        try {
//            service.delete(id);
//        } catch (DataIntegrityViolationException e) {
//            throw new DataIntegrityException("Não é possível excluir um Provedor vinculado");
//        }

        return ResponseEntity.noContent().build();
    }

}
