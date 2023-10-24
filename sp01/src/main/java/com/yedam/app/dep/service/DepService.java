package com.yedam.app.dep.service;

import java.util.List;

public interface DepService {

	//전체조회
	public List<DepVO> getDepAll();
	
	//단건조회
	public DepVO getDepInfo(DepVO depVO);
	
	//등록
	public int insertDepInfo(DepVO depVO);
	
}
