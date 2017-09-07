package com.sdczzm.controller;


import org.slf4j.MDC;
import org.springframework.web.bind.annotation.*;


@RestController
public class SampleController {

	@RequestMapping("/index")
	public String index() {
		MDC.put("user", "sdczzm"); //log4j记录日志时，记录下操作用户 %X{user}
		return "hello world!";
	}

}
