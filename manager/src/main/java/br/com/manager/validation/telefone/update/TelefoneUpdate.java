package br.com.manager.validation.telefone.update;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Repeatable(TelefoneUpdate.List.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TelefoneUpdateValidator.class)
public @interface TelefoneUpdate {

    String message() default "Telefone existente na base";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD})
    @interface List {
        TelefoneUpdate[] value();
    }
}