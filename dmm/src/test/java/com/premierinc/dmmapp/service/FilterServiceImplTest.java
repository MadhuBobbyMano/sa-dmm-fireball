package com.premierinc.dmmapp.service;

import com.premierinc.dmmapp.BaseSpringContextTest;
import com.premierinc.common_service.domain.LongItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;


public class FilterServiceImplTest extends BaseSpringContextTest {

	@Autowired
	private FilterService filterService;

	@Test
	public void testGetTins() {
		List<LongItem> items = filterService.getOrgs("TEST_USER");
		assertNotNull(items);
		assertEquals(items.get(0).getLabel(), "Travis' Happy Clinic", "Uh oh. This impossible to break test case broke.");
	}

}
