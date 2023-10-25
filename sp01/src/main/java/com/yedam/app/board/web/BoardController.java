package com.yedam.app.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yedam.app.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	//전체조회 : URI - baordList / RETURN - board/boardList
	
	
	//단건조회 : URI - boardInfo / PARAMETER - BoardVO / RETURN - board/baordInfo
	
	
	//등록 - 페이지 : URI - baordInsert /  RETURN - board/baordInsert
	
	
	//등록 - 처리 : URI - baordInsert /  PARAMETER - BoardVO / RETURN - 전체조회
	
	
	//수정 - 페이지 : URI - boardUpdate / PARAMETER - BoardVO /  RETURN - board/boardUpdate
	
	
	//수정 - 처리 : URI - boardUpdate /  PARAMETER - BoardVO / RETURN -수정결과 데이터(Map)
	
	
	//삭제 - 처리 : URI - boardDelete /  PARAMETER - Integer / RETURN -전체조회
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
