package de.nexus.springbootvue.security.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

//public class RequestValidationFilter implements Filter {
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        String requestId = request.getHeader("requestId");
////        if (requestId == null || requestId.isEmpty()) {
////            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "requestId header is missing");
////            return;
////        }
//        logger.info("Successfully authenticated request with id: " + requestId);
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//}
