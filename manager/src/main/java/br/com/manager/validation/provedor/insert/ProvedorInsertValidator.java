package br.com.manager.validation.provedor.insert;

import br.com.manager.basedados.models.Provedor;
import br.com.manager.basedados.repository.ProvedorRepository;
import br.com.manager.dto.provedor.CadastroProvedorForm;
import br.com.manager.resources.exception.FieldMessage;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProvedorInsertValidator implements ConstraintValidator<ProvedorInsert, CadastroProvedorForm> {

    @Autowired
    ProvedorRepository provedorRepository;

    @Override
    public void initialize(ProvedorInsert ann) {
    }

    @Override
    public boolean isValid(CadastroProvedorForm objDto, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        Optional<Provedor> dominioPrincipal = provedorRepository.findByDominioPrincipal(objDto.getDominioPrincipal());

        if (dominioPrincipal.isPresent()) {
            list.add(new FieldMessage("dominioPrincipal", "provedor já existente no banco"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage())
                    .addPropertyNode(e.getFieldName()).addConstraintViolation();
        }
        return list.isEmpty();
    }
}