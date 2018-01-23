package com.example.demo.Dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.User;
@Mapper
public interface Dao {

	User getlist(User user);

	void update1(User user);

	void update2(User user);

	void update3(User user);

	List<User> getlist1(HashMap<Object, Object> map);

	void update(User user);

	List<User> getlist2(HashMap<Object, Object> map);


	
}
