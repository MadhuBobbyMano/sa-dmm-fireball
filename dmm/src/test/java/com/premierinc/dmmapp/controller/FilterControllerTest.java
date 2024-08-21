package com.premierinc.dmmapp.controller;

import com.premierinc.dmmapp.service.FilterService;
import com.premierinc.common_service.domain.LongItem;
import com.premierinc.common_service.util.CommonTestConstants;
import com.premierinc.common_service.util.Constants;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class FilterControllerTest extends BaseControllerTest {
	
	@Mock
	private FilterService mockFilterService;

	@InjectMocks
	private FilterController filterController;

	@Override
	protected Object getControllerUnderTest() {
		return filterController;
	}

	@Test
	public void getOrgsTest() throws Exception {
		
		List<LongItem> expectedResults = new ArrayList<>(2);
		expectedResults.add(new LongItem(1L, "Travis' Happy Clinic"));
        expectedResults.add(new LongItem(2L, "Premier Hospital"));
		
		when(mockFilterService.getOrgs(any(String.class))).thenReturn(expectedResults);

		MockHttpServletRequestBuilder request = get("/services/filters/orgs")
				.header(Constants.HTTP_USER, "TEST_USER");
		
		mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().contentType(CommonTestConstants.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(2)))
				.andExpect(jsonPath("$[0].id", is(1)))
				.andExpect(jsonPath("$[0].label", is("Travis' Happy Clinic")))
				.andExpect(jsonPath("$[1].id", is(2)))
				.andExpect(jsonPath("$[1].label", is("Premier Hospital")));
		
	}

}
