package com.msys.web;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	protected final Logger logger = Logger.getLogger("HelloController");
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {	
	        logger.info("Returning hello view");

	        
	        return new ModelAndView("view/hello.jsp");
	}

}
