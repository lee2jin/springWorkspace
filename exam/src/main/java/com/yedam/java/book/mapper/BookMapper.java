package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {

	//전체조회
	public List<BookVO> selectAllBookInfo();
	
	//등록
	public int insertBookInfo(BookVO bookVO);

}
