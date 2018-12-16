package com.newland.jvm;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		//初始的对象在eden区
		//-Xms64m -Xmx64m -XX:+PrintGCDetails
//		for(int i=0;i<5;i++){
//			byte[] b=new byte[1024*1024];
//		}
		
		//-Xms1024m -Xmx1024m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:MaxTenuringThreshold=15 -XX:+PrintHeapAtGC
		List<byte[]> list=new ArrayList<>();
		for(int i=0;i<5;i++){
			byte[] b=new byte[1024*1024];
			list.add(b);
		}
		for(int i=0;i<6000;i++){
			byte[] b=new byte[1024*1024];
		}
	}
}
