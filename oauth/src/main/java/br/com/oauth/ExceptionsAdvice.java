package br.com.oauth;


import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionsAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UsernameNotFoundException.class)
    public Object notFound(UsernameNotFoundException e){
        System.out.println("teste advice1");
        return e.getMessage();
    }


    @ExceptionHandler(InternalAuthenticationServiceException.class)
    public Object notFound2(InternalAuthenticationServiceException e){
        System.out.println("teste advice2");
        return e.getMessage();
    }

    @ExceptionHandler(AuthenticationException.class)
    public Object notFound2(AuthenticationException e){
        System.out.println("teste 3");
        return e.getMessage();
    }



}
