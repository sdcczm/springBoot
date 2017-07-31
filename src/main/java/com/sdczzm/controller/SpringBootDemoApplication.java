package com.sdczzm.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * SpringBootApplication 要与工程类放在一个包下,
 * @author QiHuifang
 *
 */

@SpringBootApplication
@MapperScan("com.sdczzm.mapper")
public class SpringBootDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
