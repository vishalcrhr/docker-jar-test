package com.docker.learn.dockertestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages="com.docker.learn.*")
public class DockerTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestAppApplication.class, args);
	}

}
