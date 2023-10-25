package com.yedam.app.board.mapper;

import java.util.List;

import com.yedam.app.board.service.BoardVO;

public interface BoardMapper {
	//전체조회
	public List<BoardVO> selectBoardList();
	
	//단건조회 : 조건 - bno
	public BoardVO selectBoard(BoardVO boardVO);
	
	//등록 : bno(selectKey), title, contents, writer, image
	public int insertBoard(BoardVO boardVO);
	
	//수정 : title, contents, writer, updatedate, image
	public int updateBoard(BoardVO boardVO);
	
	//삭제 : 조건 - bno
	public int deleteBoard(int BoardNo);
}
