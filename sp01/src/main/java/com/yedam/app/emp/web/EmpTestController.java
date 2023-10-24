package com.yedam.app.emp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpTestController {
	
	@GetMapping("parameterTest")
	public String getMethodTest(EmpVO empVO) {
		System.out.println(empVO);
		return "";
	}
	
	@PostMapping("parameterTest")
	public String postMethodTest(EmpVO empVO) {
		System.out.println(empVO);
		return "";
	}
	
	@GetMapping("reqParamTest")
	public String reqParamGet(String employeeId, String lastName) {
		System.out.print("get : ");
		System.out.printf("%s, %s\n", employeeId, lastName);
		return "";
	}
	
	@PostMapping("reqParamTest")
	public String reqParamPost(@RequestParam String employeeId,
			                   @RequestParam(defaultValue = "guest") String lastName) {
		System.out.print("post : ");
		System.out.printf("%s, %s\n", employeeId, lastName);
		return "";
	}

	
	@GetMapping("pathGet/{employeeId}")
	public String pathGet(@PathVariable String employeeId) {
		System.out.print("get : ");
		System.out.printf("%s\n", employeeId);
		return "";
	}
	
	@PostMapping("pathPost/{id}")
	public String pathPost(@PathVariable(name = "id") String employeeId) {
		System.out.print("post : ");
		System.out.printf("%s\n", employeeId);
		return "";
	}

	@PostMapping("ajaxJson")
	@ResponseBody
	public EmpVO ajaxJson(@RequestBody EmpVO empVO) {
		return empVO;
	}
	 //@ResponseBody는 데이터만(화면X) 보내줌, 무조건 포스트 방식, 겟의 기본은 바디가 없음, 비동기통신에 붙이는 어노테이션
}
