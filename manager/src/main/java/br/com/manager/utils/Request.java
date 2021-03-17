package br.com.manager.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class Request {

    public Integer getIdRequest(HttpServletRequest httpServletRequest) {
        @SuppressWarnings("unchecked")
        Map<String, String> atributos = (Map<String, String>) httpServletRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        return Integer.parseInt(atributos.get("id"));
    }
}
