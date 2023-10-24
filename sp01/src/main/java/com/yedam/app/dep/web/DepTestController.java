package com.yedam.app.dep.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.dep.service.DepVO;

public class DepTestController {

	@Controller
	public class DepTestContoller{
		
		@GetMapping("pathGet/{departmentId}")
		public String pathGet(@PathVariable String departmentId) {
			System.out.print("get : ");
			System.out.printf("%s\n", departmentId);
			return"";
		}
		
		@PostMapping("pathPost/{id}")
		public String pathPost(@PathVariable(name = "id")String departmentId) {
			System.out.print("post : ");
			System.out.printf("%s\n", departmentId);
			return"";
		}
		
		
	}
}
