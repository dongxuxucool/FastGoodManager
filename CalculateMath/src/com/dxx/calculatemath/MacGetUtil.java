package com.dxx.calculatemath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * 获取MAC地址
 * 
 */
public class MacGetUtil{  
	
    public static void main(String[] args){  
    	
//    	try {
			System.out.println("mac = " + getMacWithCMD());
//		} catch (SocketException e) {
//			e.printStackTrace();
//		}
  
    }  
    
    public static String macGet() throws SocketException {
		String mac = "";
		StringBuffer sb = new StringBuffer();
        InetAddress inetAddress = null; //声明一个InetAddress类型ip地址  

        Enumeration<NetworkInterface> allNetInterfaces;  //定义网络接口枚举类  
        allNetInterfaces = NetworkInterface.getNetworkInterfaces();  //获得网络接口  
        
        while (allNetInterfaces.hasMoreElements()){ //遍历所有的网络接口   
            NetworkInterface netInterface = allNetInterfaces.nextElement();  
            Enumeration<InetAddress> addresses = netInterface.getInetAddresses(); //同样再定义网络地址枚举类  
            
            while (addresses.hasMoreElements()) { 
            	inetAddress = addresses.nextElement();  
                String ipStr = inetAddress.getHostAddress();
                
                if (inetAddress != null && (inetAddress instanceof Inet4Address) && !ipStr.equals("127.0.0.1")){ //InetAddress类包括Inet4Address和Inet6Address   
                    byte[] macs = netInterface.getHardwareAddress();
        			for (int i = 0; i < macs.length; i++) {
        				mac = Integer.toHexString(macs[i] & 0xFF);
        				if (mac.length() == 1)
        					mac = '0' + mac;
        				sb.append(mac + "-");
        				mac = sb.toString();
        				mac = mac.substring(0, mac.length() - 1);
        			}
        			return mac;
                } 
            }     
        }
        return null;
    }
    public static String getMacWithCMD(){
 	   String line = null;
 	   String mac = null;
 	   try {
 		   Process process = Runtime.getRuntime().exec("cd /");
 		   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
 		   while((line=bufferedReader.readLine())!=null){
 			   if(line.indexOf("Physical Address. . . . . . . . . :")!=-1){
 				   if(line.indexOf(":")!=-1){}
 				   mac=line.substring(line.indexOf(":")+2);
 				   break;
 			   }
 		   }
 		   process.waitFor();
 		   process.exitValue();

 	} catch (IOException e) {
 		System.out.println("e1 = " + e.getMessage());
// 		e.printStackTrace();
 	} catch (InterruptedException e) {
 		System.out.println("e2 = " + e.getMessage());
// 		e.printStackTrace();
 	}
 	   return mac;
    }
    
}  