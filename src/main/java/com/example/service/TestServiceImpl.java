package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TestDao;
import com.example.domain.Memos;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	TestDao dao;
	
	@Override
	public List<Memos> selectList() {
		return dao.selectList();
	}
}
