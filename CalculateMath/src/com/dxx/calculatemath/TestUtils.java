package com.dxx.calculatemath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class TestUtils {

	public static void main(String[] args) {
//		String params = "{\"name\":\"cc\",\"dimId\":\"100828\",\"rules\":[{\"member_name\":\"ccc\",\"operator\":\"5\",\"rule_value\":[\"1\"]},{\"member_name\":\"33\",\"operator\":\"14\",\"rule_value\":[\"1\",\"3\"]},{\"member_name\":\"ee\",\"operator\":\"5\",\"rule_value\":[\"342\"]}]}";
//		
//		String params2 = "[{\"member_name\":\"ccc\",\"operator\":\"5\",\"rule_value\":[\"1\"]},{\"member_name\":\"33\",\"operator\":\"14\",\"rule_value\":[\"1\",\"3\"]},{\"member_name\":\"ee\",\"operator\":\"5\",\"rule_value\":[\"342\"]}]";
		
//		JSONObject object = string2json(params);
//		
//		String name = object.getString("name");
//		
//		System.out.println("name = " + name);
//		System.out.println("dimId = " + object.getString("dimId"));
//		
//		JSONArray rules = object.getJSONArray("rules");
//		for (Object rule : rules) {
//			JSONObject ruleJson = (JSONObject)rule;
//			System.out.println("member_name = " + ruleJson.getString("member_name"));
//			
//		}
//		JSONArray rules = JSONArray.parseArray(params2);
//		for (Object rule : rules) {
//			JSONObject ruleJson = (JSONObject)rule;
//			System.out.println("Member_name = " + ruleJson.getString("member_name"));
//		}
//		List<String> testList = null;
//		for (String string : testList) {
//			System.err.println("d");
//		}
//		try {
//			filemkdir();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Integer number = null;
		System.out.println("number = " + String.valueOf(number));
		TestUtils testUtils = new TestUtils();
		String ming ="123454556-1234";
		String mi= testUtils.encode(ming);
		System.out.println("encode = " + mi);
		System.out.println("decode = " +testUtils.decode(mi));
		System.out.println("splitStr =" + splitString(ming, 2)[1]+"length = "+splitString(ming, 2).length);
		
		Long long1=12425L;
		System.out.println("integer= " + Integer.parseInt(String.valueOf(long1)));
		
		
		int order = 1;
		order++;
		System.out.println("order = " + order);
		
		String email = "ab";
		String password = "bc";
		if(!email.equals("ab") || !password.equals("bc")) System.out.println("email-password = ");
	}
	
	public String encode(String ming){
		char[] mings = ming.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char c : mings) {
			sb.append(Integer.toString(c));
		}
		return sb.toString();
	}
	public String decode(String mi){
		String[] mis = splitString(mi, 2);
		StringBuffer sb = new StringBuffer();
		for (String m : mis) {
			int ivalue = Integer.parseInt(m);
			sb.append((char)ivalue);
		}
		return sb.toString();
	}
	public static String[] splitString(String string, int len) {
		int x = string.length() / len;
		int y = string.length() % len;
		int z = 0;
		if (y != 0) {
			z = 1;
		}
		String[] strings = new String[x + z];
		String str = "";
		for (int i=0; i<x+z; i++) {
			if (i==x+z-1 && y!=0) {
				str = string.substring(i*len, i*len+y);
			}else{
				str = string.substring(i*len, i*len+len);
			}
			strings[i] = str;
		}
		return strings;
	}
	public static JSONObject string2json(String params){
		
		return JSONObject.parseObject(params);
	}
	
	public static void filemkdir() throws IOException{
		byte[] bt = new byte[1];
		bt[0] = 0x12;
		File file = new File("C:\\test/file/tmp4/122.txt");
//		if(!file.exists())
//			file.mkdirs();
			try {
				FileOutputStream fis = new FileOutputStream(file);
				fis.write(bt);
				fis.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
}
