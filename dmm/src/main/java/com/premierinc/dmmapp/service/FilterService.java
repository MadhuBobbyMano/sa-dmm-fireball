package com.premierinc.dmmapp.service;


import com.premierinc.common_service.domain.LongItem;
import java.util.List;

public interface FilterService {
	List<LongItem> getOrgs(String userLogin);
}