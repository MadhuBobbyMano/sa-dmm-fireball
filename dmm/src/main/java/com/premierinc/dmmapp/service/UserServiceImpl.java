package com.premierinc.dmmapp.service;

import com.premierinc.common_service.domain.User;
import com.premierinc.common_service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dmmappUserServiceImpl")
@Slf4j
@Primary
public class UserServiceImpl implements UserService {

    public User getUserInfo(String userLogin) {
        //TODO Implement if persiting User information
        return null;
    }

    public List<String> getUserRoles(String userLogin) {
        //TODO Implement if using ACL
        return null;
    }

}