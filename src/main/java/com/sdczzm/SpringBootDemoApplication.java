package com.sdczzm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * SpringBootApplication  启动类的同级包及其子包下的类都会扫描，并加载组件
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
