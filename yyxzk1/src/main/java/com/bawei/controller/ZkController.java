package com.bawei.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZkController {
	//方法1：获取url上的参数，返回字符串值类型，如	果没有该参数则返回默认值 (5分)
	@RequestMapping("list.do")
	public String getString(HttpServletRequest request, String name, String defaultValue){
		String parameter = request.getParameter(name);
		System.out.println(parameter);
		if(parameter=="" || parameter==null){
//			name="";
			System.out.println(parameter);
		}else{
			System.out.println(parameter);
		}
		return "";
	}
	
	
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认
	@RequestMapping("list1.do")
	public Integer getInt(Integer a){
		System.out.println("1s");
		if(a==null){
			return 0;
		}else{
			return a;
		}
	}
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	@RequestMapping("list2.do")
	public String getUrl(HttpServletRequest request){
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		return request.getRequestURI();
	}
	
//	方法5：给定一个Cookie名获得取Cookie值 (5分)
	@RequestMapping("list3.do")
	public String getCookieValue(HttpServletRequest request){
			Cookie[] cookies = request.getCookies();
			System.out.println(cookies);
		return "";
	}


}
