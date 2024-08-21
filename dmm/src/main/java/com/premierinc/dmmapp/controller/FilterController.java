package com.premierinc.dmmapp.controller;

import com.premierinc.dmmapp.service.FilterService;
import com.premierinc.dmmapp.util.ServletUtil;
import com.premierinc.common_service.domain.LongItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Handles requests for filters
 */
@RestController
@RequestMapping("/services/filters")
@Slf4j
public class FilterController {
	
	@Autowired
	private FilterService filterService;

	/**
	 * Handle filter request for list of organizations
	 * @param userLogin
	 * @return
	 */
	@GetMapping("/orgs")
	public List<LongItem> getOrgs(@RequestHeader(value = "HTTP_USER") String userLogin,
								  HttpServletRequest request) {

		log.info("User {} is making a request for Organizations for IP: {}",
				userLogin, ServletUtil.getIpFromRequest(request));
		return filterService.getOrgs(userLogin);
	}


}