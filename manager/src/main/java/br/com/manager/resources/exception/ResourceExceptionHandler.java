package br.com.manager.resources.exception;

import br.com.manager.exceptions.DataIntegrityException;
import br.com.manager.exceptions.ObjectNotFoundException;
import com.fasterxml.jackson.core.JsonParseException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.UnexpectedTypeException;
import java.util.NoSuchElementException;


@RestControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<?> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {

        StandardError standardError = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
    }


    @ExceptionHandler(DataIntegrityException.class)
    public ResponseEntity<?> dataIntegrity(DataIntegrityException e, HttpServletRequest request) {

        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage() + " DATA INTEGRITY", System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrors> argumentNotValid(MethodArgumentNotValidException e, HttpServletRequest request) {

        ValidationErrors validationErrors = new ValidationErrors(HttpStatus.BAD_REQUEST.value(), "ERRO METHOD ARGUMENT NOT VALID EXCEPTION", System.currentTimeMillis());

        for (FieldError erro : e.getBindingResult().getFieldErrors()) {
            validationErrors.addError(erro.getField(), erro.getDefaultMessage());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationErrors);
    }


    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> constrainViolation(ConstraintViolationException e, HttpServletRequest request) {

        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getSQLException().toString() + " ERRO DE CONSTRAIN", System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

    @ExceptionHandler(JsonParseException.class)
    public ResponseEntity<?> constrainViolation(JsonParseException e, HttpServletRequest request) {

        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), "Formato de dado inválido", System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }


    @ExceptionHandler(UnexpectedTypeException.class)
    public ResponseEntity<?> constrainViolation(UnexpectedTypeException e, HttpServletRequest request) {

        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), "Verifique os campos" + e.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<?> noSuchElement(NoSuchElementException e, HttpServletRequest request) {

        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage() + " ERRO - NO SUCH ELEMENTO - NÃO HÁ VALOR EM ALGUM ELEMENTO ARRAY ETC.", System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }


}