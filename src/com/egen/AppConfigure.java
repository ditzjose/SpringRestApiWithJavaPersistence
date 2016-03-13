package com.egen;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan
public class AppConfigure {

}
/*
 IoC or Di:
 	Conscept is to not to create object. Still access the the object to avoid tight coupling.
 Types of Dependency Injection:
 	Constructor,getter setter,interface
 Benifits of Ioc(DI):
 	Minimize the code.
 	Loose coupling will happen.
 	To maintain modularity.
 	Each module are said to be independ
 	
 
 */