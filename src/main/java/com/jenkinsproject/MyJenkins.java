package com.jenkinsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJenkins {

	@GetMapping("/get")
	public String getOne() {
		return "jenkins";
	}

	@GetMapping("/getData")
	public String palindrome() {
		String a = "mom";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
		}
		if (b.equalsIgnoreCase(a)) {
			return "is palindrome";
		} else {
			return "not palindrome";
		}
	}

	@GetMapping("/getData1")
	public String getTwo() {
		return "welcome";
	}

}