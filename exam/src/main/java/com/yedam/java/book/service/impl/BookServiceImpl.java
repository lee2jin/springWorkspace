package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookMapper bookMapper;

	@Override
	public List<BookVO> getBookAll() {
		return bookMapper.selectAllBookInfo();
	}

	@Override
	public int insertBookInfo(BookVO bookVO) {
		int result = bookMapper.insertBookInfo(bookVO);
		if(result ==1) {
			return bookVO.getBookNo();
		}else {
			return -1;
		}
	}
	
	
}
