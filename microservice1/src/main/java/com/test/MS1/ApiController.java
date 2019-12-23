package com.test.MS1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ApiController {

	private static Logger log = LoggerFactory.getLogger(ApiController.class);

	@Value("${message:Hello default}")
	private String message;

	@GetMapping("/v1")
	public String test() {
		log.info("test");
		return "OK" + message;
	}

	@RequestMapping("/message")
	String getMessage() {
		log.info("test1");
		return this.message;
	}
}
