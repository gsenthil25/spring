package com.msys.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase {

	@Test
	public void testHandleRequest() throws Exception {
		HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
	}

}
