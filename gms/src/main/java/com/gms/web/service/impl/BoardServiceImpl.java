package com.gms.web.service.impl;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gms.web.domain.ArticleDTO;
import com.gms.web.mapper.BoardMapper;
import com.gms.web.service.BoardService;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired BoardMapper boardMapper;
	@Override
	public void add(ArticleDTO p) {
		p.setRegdate(new SimpleDateFormat("yy:MM:dd").format(new Date()));
		boardMapper.insert(p);
		
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleDTO retrieve(ArticleDTO p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(ArticleDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(ArticleDTO p) {
		// TODO Auto-generated method stub
		return false;
	}

}
