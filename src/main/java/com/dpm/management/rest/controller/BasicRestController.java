package com.dpm.management.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasicRestController {

	public BasicRestController() {
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String hello() {

		return "{message: 'Hello World!!!'}";
	}
}
