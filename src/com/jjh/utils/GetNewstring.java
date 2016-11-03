package com.jjh.utils;

public class GetNewstring {
	public static String getNewString(String str){
		String newString="";
		try{
			newString =new String(str.getBytes("iso-8859-1"),"gb2312");
		}catch(Exception e){
			e.printStackTrace();
		}
		return newString;
	}
}
