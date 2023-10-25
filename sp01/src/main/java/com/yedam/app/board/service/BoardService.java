package com.yedam.app.board.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	//전체조회
	public List<BoardVO> getBoardList();
	
	//단건조회
	public BoardVO getBoard(BoardVO boardNo);
	
	//등록
	public int insertBoard(BoardVO boardNo);
	
	//수정
	public Map<String, Object> updateBoard(BoardVO boardNo);
	
	//삭제
	public int deleteBoard(int boardNo);
}
