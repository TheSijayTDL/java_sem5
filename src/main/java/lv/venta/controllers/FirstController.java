package lv.venta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	
	@GetMapping("/hello") // localhost:8080/hello
	public String getHelloFunc() {
		System.out.println("test");
		return "hello-page"; // html page
	}
	
	@GetMapping("/msg") // localhost:8080/msg
	public String getMsgFunc(Model model) {
		model.addAttribute("message", "Hello World!");
		return "msg-page"; // html page
	}
	
}
