package com.miu.cs.cs544.ether;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ether_test {
	@RequestMapping("/")
	public String getGreetingMessage() {
		return "welcome to ether group";
	}
	@GetMapping("/ether/{membername}")
	public String getEtherMessage(@PathVariable String membername) {
		return "Hello,"+membername;
	}
}
