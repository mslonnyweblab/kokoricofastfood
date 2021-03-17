package br.com.gateway.filter;

import br.com.gateway.entity.User;
import br.com.gateway.feign.ValidToken;
import br.com.gateway.service.UserService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class FilterPos extends ZuulFilter {


    @Autowired
    UserService userService;


    public FilterPos() {
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

        System.out.println("---------------------------REQUEST-POS -->> METHOD NO ZUUL + " + request.getMethod());
        System.out.println("---------------------------REQUEST-POS -->> URL NO ZUUL + " + request.getRequestURL().toString());
        System.out.println("---------------------------REQUEST-POS -->> URL NO ZUUL + " + request);

        String access_token = request.getParameter("access_token");

        if (access_token != null){
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            try {
                if (authentication != null){
                    User byPrincipal = userService.validaToken();
                }
            }catch (Exception e){
                e.printStackTrace();
            }


            System.out.println("teste");
        }



        return null;
    }
}


//    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();