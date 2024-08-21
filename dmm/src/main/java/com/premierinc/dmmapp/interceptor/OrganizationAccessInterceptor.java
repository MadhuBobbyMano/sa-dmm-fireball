package com.premierinc.dmmapp.interceptor;

import com.premierinc.common_service.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Slf4j
public class OrganizationAccessInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler){

        Boolean authorized = Boolean.FALSE;
        String userLogin = request.getHeader(Constants.HTTP_USER);

        //TODO Perform logic to validate access using HTTP_USER
        authorized = Boolean.TRUE;

        if (!authorized) {
            log.error("User {} does not have the necessary permission to access {}", userLogin, request.getRequestURI());
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
        }
        return authorized;
    }
}