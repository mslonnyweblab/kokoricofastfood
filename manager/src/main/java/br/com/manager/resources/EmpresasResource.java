package br.com.manager.resources;


import br.com.manager.basedados.models.Empresa;
import br.com.manager.services.EmpresasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/banco")
public class EmpresasResource {

    @Autowired
    private EmpresasService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Empresa find(@PathVariable Integer id) {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Empresa> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
