package com.premierinc.dmmapp.controller;

import com.premierinc.dmmapp.BaseSpringContextTest;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeMethod;


public abstract class BaseControllerTest extends BaseSpringContextTest {

	protected MockMvc mockMvc;

	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		this.mockMvc = MockMvcBuilders.standaloneSetup(getControllerUnderTest()).build();
	}

	protected abstract Object getControllerUnderTest();
}
