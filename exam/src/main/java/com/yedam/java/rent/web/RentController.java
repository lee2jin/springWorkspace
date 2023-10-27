package com.yedam.java.rent.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.rent.service.RentService;
import com.yedam.java.rent.service.RentVO;

@Controller
public class RentController {
	@Autowired
	RentService rentService;
	
	//조회
	@GetMapping("RentList")
	public String getRentList(Model model) {
		List<RentVO> list = rentService.getRentAll();
		model.addAttribute("RentList",list);
		return "book/rentList";
	}
}
