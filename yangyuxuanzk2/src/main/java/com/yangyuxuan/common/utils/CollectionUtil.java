package com.yangyuxuan.common.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionUtil {
	
	public static void main(String[] args) {
		//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
		List list = new ArrayList();
		 boolean empty = list.isEmpty();
		 System.out.println(empty);
		 
		 //2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
		Map map = new HashMap();
		map.put(1, 1);
//		Map<Object, Object> emptyMap = Collections.emptyMap();
		boolean empty2 = map.isEmpty();
		System.out.println(empty2);
	}
	

}
