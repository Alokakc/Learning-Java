package com.alok.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args) - this is the ioc(inversion of control)
//		container which is managed by spring to create the object of classes
//		Developer does not need to worry about the creation of the object,
//		spring framework will take care of object creation and also the life cycle of the objects
//
//		ApplicationContext is the reference to the spring ioc container in jvm
//		SpringApplication.run(DemoApplication.class, args) run method returns the ApplicationContext
//		object.


		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//		fetching the bean(an object) of Dev class from spring ioc container
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
