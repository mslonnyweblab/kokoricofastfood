package br.com.gateway.feign.interceptor;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Component;

@Component
public class InterceptorFeign {

    @Bean
    public RequestInterceptor getInterceptorDeAutenticacao() {
        return template -> {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication == null) {
                return;
            }

            OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) authentication.getDetails();
            template.header("Authorization", "Bearer " + details.getTokenValue());
        };
    }
}
