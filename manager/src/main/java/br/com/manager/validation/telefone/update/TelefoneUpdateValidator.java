package br.com.manager.validation.telefone.update;


import br.com.manager.basedados.models.Telefone;
import br.com.manager.basedados.repository.TelefoneRepository;
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


class TelefoneUpdateValidator implements ConstraintValidator<TelefoneUpdate, List<Telefone>> {

    @Autowired
    TelefoneRepository telefoneRepository;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Override
    public boolean isValid(List<Telefone> telefone, ConstraintValidatorContext context) {
        @SuppressWarnings("unchecked")
        Map<String, String> atributos = (Map<String, String>) httpServletRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        int id = Integer.parseInt(atributos.get("id"));


        List<FieldMessage> list = new ArrayList<>();

        Optional<Telefone> telefonse = telefoneRepository.findByNumero("");

        System.out.println("ENTREI NA VALIDAÇÃO DE TELEFONES" + id);

//        if (dominioPrincipal.isPresent() && !dominioPrincipal.get().getId().equals(idUri)) {
//            list.add(new FieldMessage("dominioPrincipal", "provedor existente no banco"));
//            System.out.println(list);
//        }

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