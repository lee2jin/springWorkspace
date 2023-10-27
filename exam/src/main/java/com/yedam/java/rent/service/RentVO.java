package com.yedam.java.rent.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class RentVO {
	private int rentNo;
	private int bookNo;
	private int rentPrice;
	@DateTimeFormat(pattern="yy/MM/dd")
	private Date rentDate;
	private String rentStatus;
}
