package com.dxx.calculatemath;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dxx.dto.NameValuePair;
import com.dxx.dto.ObjectInfoDto;

public class ObjectTOJson {

	public static void main(String[] args) {
		List<String> member = new ArrayList<String>();
		ObjectInfoDto nat = new ObjectInfoDto();
		nat.setName("aa");
		nat.setType(1);
		nat.setMember(new ArrayList<NameValuePair>()); 
		String json = JSONObject.toJSON(nat).toString();
		System.out.println("json = " + json);
		JSONObject jsonObj = JSONObject.parseObject(json);
		jsonObj.put("name", "bb");
		System.out.println("json2 = " + jsonObj.toJSONString());
		System.out.println("json = " + json);
		JSONObject object = JSONObject.parseObject(json);
		JSONArray memberArray = object.getJSONArray("member");
		System.out.println("memberArray =" + memberArray);
		
		
		member.add("123");
		member.add("1234");
		String jsons = JSONArray.toJSONString(member);
		JSONArray testJsonArray = JSONArray.parseArray(jsons);
		for (Object obj : testJsonArray) {
			String number = (String)obj;
//			testJsonArray.
		}
//		JSONObject.
		
		List<NameValuePair> nvList = new ArrayList<NameValuePair>();
		NameValuePair nv1 = new NameValuePair();
		nv1.setName("a");
		nv1.setValue("1");
		NameValuePair nv2 = new NameValuePair();
		nv2.setName("a");
		nv2.setValue("1");
		nvList.add(nv1);
		nvList.add(nv2);
		for (NameValuePair nv : nvList) {
			nv.setName("c");
		}
		System.out.println("nvList = " + nvList.get(0).getName());
	}

}
