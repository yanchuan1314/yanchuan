package com.example.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Service.Service;
import com.example.demo.dto.User;

@Controller
public class DoContrller {
	@Autowired
	private Service ser;
	
	@RequestMapping("tologin")
	public String tologin() {
		return "login";
		
	}
	@RequestMapping("login")
	@ResponseBody
	public Object login(HttpServletRequest request,User user) {
		HttpSession session = request.getSession();
		
		 Map<String, Object> map=new HashMap<String, Object>();
		 User user1=ser.getlist(user);
		
		
		 if(user1!=null)
		 {
			
			 map.put("cool", "success");
			 session.setAttribute("n",user);
		 }
		 else
		 {
			 
			 map.put("cool", "false");
		 }
		return map;
	}
	@RequestMapping("list")
	public String list(HttpServletRequest request,User user) {
		HttpSession session = request.getSession();
		
		User user1 = (User)session.getAttribute("n");
		HashMap<Object, Object> map = new HashMap<>();
		map.put("user1", user1);
		map.put("did", user1.getDid());
		
		List<User> list1=ser.getlist1(map);
		
        request.setAttribute("list1", list1);
		return "list";
		
		
		
	}
	@RequestMapping("list1")
	public String list1(HttpServletRequest request,User user) {
HttpSession session = request.getSession();
		
		User user1 = (User)session.getAttribute("n");
		HashMap<Object, Object> map = new HashMap<>();
		map.put("user1", user1);
		map.put("did", user1.getDid());
		List<User> list2=ser.getlist2(map);
	    request.setAttribute("list2", list2);
	    return "list1";
	}
	@RequestMapping("info")
	public String tologin1() {
		return "info";
		
	}
	@RequestMapping("update1")
	public String update1(HttpServletRequest request,User user) {
		ser.update1(user);
		return "redirect:list1";
		
		
	}
	@RequestMapping("update2")
	public String update2(HttpServletRequest request,User user) {
		ser.update2(user);
		return "redirect:list1";
		
		
	}
	@RequestMapping("update3")
	public String update3(HttpServletRequest request,User user) {
		ser.update3(user);
		return "redirect:list1";
		
		
	}
	
	@RequestMapping("yupdate")
	public String yupdate(HttpServletRequest request,User user) {
		request.setAttribute("uid", user.getUid());
		return "update";
		
	}
	@RequestMapping("update")
	public String update(HttpServletRequest request,User user) {
		ser.update(user);
		return "redirect:list1";
		
	}
	
}
