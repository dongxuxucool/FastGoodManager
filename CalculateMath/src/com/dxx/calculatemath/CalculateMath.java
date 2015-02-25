package com.dxx.calculatemath;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class CalculateMath {
	
//	private final static int r = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<Double, Double> xyMap = new LinkedHashMap<>();
		int r = 100;
		int num = 7;
//		CalcuateMethod(r, num);
		String factIdStr = "[10009]";
		String[] factStrings = factIdStr.split("]");
        long factId = Long.parseLong(factIdStr.substring(1, factIdStr.length()-1));
        System.out.println("factId = " + factId);
		System.out.println(""+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));//        Set set = xyMap.entrySet();   
		
		
		for (int i = 0; i < factStrings.length; i++) {
			System.out.println(i + ": " + factStrings[i]);
		}

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		format.setLenient(false);
		String strResponseDate = format.format(date);
		System.out.println("strResponseDate = " + strResponseDate); 
		System.out.println("time = " + System.currentTimeMillis());
		//        Iterator iterator =     set.iterator();   
//        while(iterator.hasNext())   
//        {   
//          Map.Entry mapentry = (Map.Entry)iterator.next();   
//          System.out.println(mapentry.getKey() + "/" + mapentry.getValue());   
//        } 
//        System.out.println("sin(90) = "+Math.sin(90.0*Math.PI/180));
//        System.out.println("cos(90) = "+(int)Math.cos(90.0*Math.PI/180));
//        System.out.println("sin(-90) = "+(int)Math.sin(Math.abs(-90.0*Math.PI/180)));
//        System.out.println("cos(-90) = "+Math.cos(-90.0*Math.PI/180));
	}

	public static void CalcuateMethod(int r ,int num){
		double x = 0.0;
		double y = 0.0;
		int p = 0;

		for (int i = 0; i < num; i++) {
			p = (360*i/num-90);
			x = 50*Math.cos(p*Math.PI/180)+50;
			y = 50*Math.sin(p*Math.PI/180)+50;
			System.out.println("x = "+x);
			System.out.println("y = "+y);;
			
		}
	}
}
