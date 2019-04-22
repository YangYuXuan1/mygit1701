package com.yangyuxuan.common.utils;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	/*
	 * 
	 *字符串工具类
	 */
	public static void main(String[] args) {
		//判断源字符串是否有值，空引号(空白字符串)也算没值 (
		System.out.println(hasLength(""));
		//判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
		System.out.println(hasText("  "));
		//方法3：判断是否为手机号码 (5分)
		System.out.println(isMobile("13811111111"));
		//方法4：判断是否为邮箱 (5分)
		System.out.println(isEmail("2314434522@qq.cn"));
		//反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
		System.out.println(reverse("abcdefg"));
	}
	
	//判断源字符串是否有值，空引号(空白字符串)也算没值 (
	public static boolean hasLength(String src){
		return StringUtils.isEmpty(src);
	}
	//判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
		return StringUtils.isNotBlank(src);
	}
	//方法3：判断是否为手机号码 (5分)
	public static boolean isMobile(String src){
		String reg="[1][3-8][0-9]{9}";
		Boolean tel = src.matches(reg);
		return tel;
	}
	//方法4：判断是否为邮箱 (5分)
	public static boolean isEmail(String src){
		String str="[0-9]+@\\w+.(com|cn)";
		boolean matches = src.matches(str);
		return matches;
	}
	//反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public static String reverse(String src){
		return StringUtils.reverse(src);
	}


}
