package com.premierinc.dmmapp.util;

import jakarta.servlet.http.HttpServletRequest;

public final class ServletUtil {

    private ServletUtil(){
        //not called
    }

    public static String getIpFromRequest(HttpServletRequest request){
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        return ipAddress;
    }
}
