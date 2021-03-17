package br.com.manager.validation.provedor.update;

import br.com.manager.basedados.models.Ip;
import br.com.manager.basedados.models.Provedor;
import br.com.manager.basedados.repository.IpRepository;
import br.com.manager.basedados.repository.ProvedorRepository;
import br.com.manager.dto.provedor.UpdateProvedorForm;
import br.com.manager.resources.exception.FieldMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProvedorUpdateValidator implements ConstraintValidator<ProvedorUpdate, UpdateProvedorForm> {

    @Autowired
    ProvedorRepository provedorRepository;

    @Autowired
    IpRepository ipRepository;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Override
    public void initialize(ProvedorUpdate ann) {
    }

    @Override
    public boolean isValid(UpdateProvedorForm objDto, ConstraintValidatorContext context) {
        @SuppressWarnings("unchecked")
        Map<String, String> atributos = (Map<String, String>) httpServletRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        int idUri = Integer.parseInt(atributos.get("id"));
        List<FieldMessage> list = new ArrayList<>();

        Optional<Provedor> dominioPrincipal = provedorRepository.findByDominioPrincipal(objDto.getDominioPrincipal());

        Optional<Provedor> dominioPrincipalUri = provedorRepository.findById(idUri);


        if (!dominioPrincipalUri.isPresent()) {
            list.add(new FieldMessage("dominioPrincipal", "você tentou acessar um recurso que não existe"));
        } else if (dominioPrincipal.isPresent() && !dominioPrincipal.get().getId().equals(idUri)) {
            list.add(new FieldMessage("dominioPrincipal", "provedor existente no banco"));
        }

        if (dominioPrincipalUri.isPresent()) {
            System.out.println("IMPRIMINDO IP -> TESTE");

            List<Ip> listaDeIps = ipRepository.findAll();

            for (Ip ip : dominioPrincipalUri.get().getIp()) {

//                Ip resultIp = ipRepository.findByIpIn(ip.getIp(), listaDeIps);
//
//                System.out.println("RESULT IP -> " + resultIp);
//                if (resultIp != null) {
//
//                }
//                System.out.println("IMPRIMINDO IP -> " + ip);
            }
        }


        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context
                    .buildConstraintViolationWithTemplate(e.getMessage())
                    .addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }
        return list.isEmpty();
    }
}