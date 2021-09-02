package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Memos;

@Mapper
public interface TestDao {
	public List<Memos> selectList();
}
