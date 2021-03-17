package br.com.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class FilterRoute extends ZuulFilter {


    public FilterRoute() {
        System.out.println("INICIANDO FILTER");
    }

    /*
     *   PODE RETORNAR 4 TIPOS DE STRING
     *   PRE, POST, ROUTE E ERROR
     * */
    @Override
    public String filterType() {
        return "";
    }


    /*
     *
     * ORDEM DE EXECUÇÃO DOS FILTROS
     *
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rcx = RequestContext.getCurrentContext();
        HttpServletRequest request = rcx.getRequest();

        System.out.println("---------------------------REQUEST-ROUTE METHOD NO ZUUL + " + request.getMethod());
        System.out.println("---------------------------REQUEST-ROUTE URL NO ZUUL + " + request.getRequestURL().toString());

        return null;
    }
}

//    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();