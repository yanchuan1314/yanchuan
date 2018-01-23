package com.example.demo.Service.imlp;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Dao.Dao;
import com.example.demo.Service.Service;
import com.example.demo.dto.User;
@org.springframework.stereotype.Service
public class Serviceimlp implements Service {
@Autowired
  private Dao d;

@Override
public User getlist(User user) {
	// TODO Auto-generated method stub
	return d.getlist(user);
}



@Override
public void update1(User user) {
	d.update1(user);
	
}

@Override
public void update2(User user) {
	d.update2(user);
	
}

@Override
public void update3(User user) {
	d.update3(user);
	
}



@Override
public List<User> getlist1(HashMap<Object, Object> map) {
	// TODO Auto-generated method stub
	return d.getlist1(map);
}



@Override
public void update(User user) {
d.update(user);
	
}

@Override
public List<User> getlist2(HashMap<Object, Object> map) {
	// TODO Auto-generated method stub
	return d.getlist2(map);
}











}
