package de.nexus.springbootvue.security.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StaticKeyAuthenticationFilter {
//public class StaticKeyAuthenticationFilter implements Filter {
////    @Value("${authorization.key}")
////    private String authorizationKey;
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
////        String authHeader = request.getHeader("Authorization");
////        if (authorizationKey.equals(authHeader)) {
////            filterChain.doFilter(request, response);
////        } else {
////            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
////        }
//
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
}
