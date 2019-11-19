package com.cg.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hi")
	public String sayHello() {
		return "home"; // returning a view (home.jsp)
	}
}
