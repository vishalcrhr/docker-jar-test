package com.docker.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerAppController {

	@RequestMapping(value="/hello")
	public String getTestValue() {
		return "hello world";
	}
}
