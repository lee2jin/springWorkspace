package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	//도서 전체조회
	public List<BookVO> getBookAll();
	//도서 등록
	public int insertBookInfo(BookVO bookVO);
}
