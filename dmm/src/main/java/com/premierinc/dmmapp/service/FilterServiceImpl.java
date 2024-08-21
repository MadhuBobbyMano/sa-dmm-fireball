package com.premierinc.dmmapp.service;

import com.premierinc.common_service.domain.LongItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FilterServiceImpl implements FilterService {


    @Override
    public List<LongItem> getOrgs(String userLogin) {
        if(log.isTraceEnabled()){
            log.trace("Entering com.premierinc.dmmapp.service.getOrgs - userLogin: {}", userLogin);
        }

        List<LongItem> orgs = new ArrayList<>(2);
        orgs.add(new LongItem(1L, "Travis' Happy Clinic"));
        orgs.add(new LongItem(2L, "Premier Hospital"));

        return orgs;
    }
}
