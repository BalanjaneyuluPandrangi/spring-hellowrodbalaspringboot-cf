package com.example.balaspringbootapp.springhellowrodbalaspringbootcf;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@RequestMapping("/hello")
	String getMessage(@RequestParam(value="name") String name){
		String rsp="Hello"+name+" :responded on  :"+new Date();
		return rsp;
	}

}
