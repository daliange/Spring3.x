package com.baobaotao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/errorcontroller")
public class ErrorController {
	
	@RequestMapping("/error")
	public String error() throws Exception{
		Exception e = new Exception();
		e.printStackTrace();
		throw e;
	}

}
