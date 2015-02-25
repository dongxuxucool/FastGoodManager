package com.dxx.calculatemath;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alibaba.fastjson.JSONArray;
import com.dxx.dto.AppModel;
import com.dxx.dto.ObjectInfoDto;

public class ConTest {

	private File file;
	public ConTest(File file){
		this.file = file;
	}
	
	public String getName(){
		String name = file.getName();
		return name;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		File file = new File("C:\\test/file/tmp/1.txt");
//		ConTest ct = new ConTest(file);
//		System.out.println("filename = " + ct.getName());
//		String string = "C:\\test/file/tmp/faf/1.txt";
//		String string2 = string.substring(0, string.lastIndexOf("/"));
//		System.err.println(string + "????" + string2);
        UUID uuid = UUID.randomUUID();
        System.out.println("" + uuid.toString());
        System.out.println("uuid = " +uuid);
        UUID uuid2 = UUID.randomUUID();
        System.out.println("uuid2 = " + uuid2);
//        Long l1= 10L;
//        Long l2= 11L;
//        System.out.println("" + (l1-l2));
//        Long shuzi = 100L;
//        System.out.println(""+shuzi*24*3600);
//		ObjectInfoDto nat = new ObjectInfoDto();
//		nat.setName("name1");
//		nat.setType(1);
//		List<ObjectInfoDto> nats = new ArrayList<ObjectInfoDto>();
//		nats.add(nat);
//		nats.add(nat);
//		AppModel appModel = new AppModel();
//		appModel.setGroupName("g1");
//		appModel.setDimension(nats);
//		appModel.setMeasure(nats);
//		List<AppModel> appModels = new ArrayList<AppModel>();
//		appModels.add(appModel);
//		appModels.add(appModel);
//		JSONArray array = (JSONArray)JSONArray.toJSON(appModels);
//		System.out.println("aray = "+array.toJSONString());
    }

}
