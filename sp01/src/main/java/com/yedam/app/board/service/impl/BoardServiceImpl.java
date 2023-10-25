package com.yedam.app.board.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.board.mapper.BoardMapper;
import com.yedam.app.board.service.BoardService;
import com.yedam.app.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getBoardList() {
		return boardMapper.selectBoardList();
	}

	@Override
	public BoardVO getBoard(BoardVO boardVO) {
		return boardMapper.selectBoard(boardVO);
	}

	@Override
	public int insertBoard(BoardVO boardVO) {
		int result = boardMapper.insertBoard(boardVO);
		
		if(result == 1) {
			return boardVO.getBno();
		}else {
			return -1;
		}
	}

	@Override
	public Map<String, Object> updateBoard(BoardVO boardVO) {
		Map<String, Object> map = new HashMap<>();
		boolean inSuccessed = false;
		int result = boardMapper.updateBoard(boardVO);
		if(result == 1) {
			inSuccessed = true;
		}
		map.put("result", inSuccessed);
		map.put("info", boardVO);
		
		return map;
	}

	@Override
	public int deleteBoard(int boardNo) {
		return boardMapper.deleteBoard(boardNo);
	}

}
