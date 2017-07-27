package com.sdczzm.controller;


import org.springframework.web.bind.annotation.*;


@RestController
public class SampleController {

	@RequestMapping("/index")
	public String index() {
		return "hello world!";
	}

}
