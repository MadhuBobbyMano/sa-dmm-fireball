package com.premierinc.dmmapp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("dmmappHipaaSecurityServiceImpl")
@Primary
public class HipaaSecurityServiceImpl extends com.premierinc.common_service.service.HipaaSecurityServiceImpl {

    @Override
    public int logViewedHipaaMsg(String httpUser, String context, String key, String value) {
        //TODO If you wish to log HIPAA messages to a database this can be properly implemented
        return 0;
    }
}
