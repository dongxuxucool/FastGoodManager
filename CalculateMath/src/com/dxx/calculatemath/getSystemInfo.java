package com.dxx.calculatemath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Properties;

public class getSystemInfo {

	public static void main(String[] args){
		 Properties props=System.getProperties(); //ϵͳ����

	//   Set<Object> keySet = sysProperty.keySet();
	//   for (Object object : keySet) {
//	    String property = sysProperty.getProperty(object.toString());
//	    System.out.println(object.toString()+" : "+property);
	//   }
	   System.out.println("Java�����л����汾��"+props.getProperty("java.version"));
	   System.out.println("Java�����л�����Ӧ�̣�"+props.getProperty("java.vendor"));
	   System.out.println("Java��Ӧ�̵�URL��"+props.getProperty("java.vendor.url"));
	   System.out.println("Java�İ�װ·����"+props.getProperty("java.home"));
	   System.out.println("Java��������淶�汾��"+props.getProperty("java.vm.specification.version"));
	   System.out.println("Java��������淶��Ӧ�̣�"+props.getProperty("java.vm.specification.vendor"));
	   System.out.println("Java��������淶���ƣ�"+props.getProperty("java.vm.specification.name"));
	   System.out.println("Java�������ʵ�ְ汾��"+props.getProperty("java.vm.version"));
	   System.out.println("Java�������ʵ�ֹ�Ӧ�̣�"+props.getProperty("java.vm.vendor"));
	   System.out.println("Java�������ʵ�����ƣ�"+props.getProperty("java.vm.name"));
	   System.out.println("Java����ʱ�����淶�汾��"+props.getProperty("java.specification.version"));
	   System.out.println("Java����ʱ�����淶��Ӧ�̣�"+props.getProperty("java.specification.vender"));
	   System.out.println("Java����ʱ�����淶���ƣ�"+props.getProperty("java.specification.name"));
	   System.out.println("Java�����ʽ�汾�ţ�"+props.getProperty("java.class.version"));
	   System.out.println("Java����·����"+props.getProperty("java.class.path"));
	   System.out.println("���ؿ�ʱ������·���б�"+props.getProperty("java.library.path"));
	   System.out.println("Ĭ�ϵ���ʱ�ļ�·����"+props.getProperty("java.io.tmpdir"));
	   System.out.println("һ��������չĿ¼��·����"+props.getProperty("java.ext.dirs"));
	   System.out.println("����ϵͳ�����ƣ�"+props.getProperty("os.name"));
	   System.out.println("����ϵͳ�Ĺ��ܣ�"+props.getProperty("os.arch"));
	   System.out.println("����ϵͳ�İ汾��"+props.getProperty("os.version"));
	   System.out.println("�ļ��ָ�����"+props.getProperty("file.separator"));   //�� unix ϵͳ���ǣ�����
	   System.out.println("·���ָ�����"+props.getProperty("path.separator"));   //�� unix ϵͳ���ǣ�:��
	   System.out.println("�зָ�����"+props.getProperty("line.separator"));   //�� unix ϵͳ���ǣ�/n��
	   System.out.println("�û����˻����ƣ�"+props.getProperty("user.name"));
	   System.out.println("�û�����Ŀ¼��"+props.getProperty("user.home"));
	   System.out.println("�û��ĵ�ǰ����Ŀ¼��"+props.getProperty("user.dir")); 
	   
	   System.out.println("serialNum = " + getSerialNumber("c"));
	   
	}
	 public static String getSerialNumber(String drive) {
		    String result = "";
		      try {
		        File file = File.createTempFile("realhowto",".vbs");
		        file.deleteOnExit();
		        FileWriter fw = new java.io.FileWriter(file);

		        String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
		                    +"Set colDrives = objFSO.Drives\n"
		                    +"Set objDrive = colDrives.item(\"" + drive + "\")\n"
		                    +"Wscript.Echo objDrive.SerialNumber";  // see note
		        fw.write(vbs);
		        fw.close();
		        Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
		        BufferedReader input =new BufferedReader(new InputStreamReader(p.getInputStream()));
		        String line;
		        while ((line = input.readLine()) != null) {
		           result += line;
		        }
		        input.close();
		      }
		      catch(Exception e){
		          e.printStackTrace();
		      }
		      return result.trim();
		    }
}
