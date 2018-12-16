package com.newland.jvm;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	public static void main(String[] args) {
		//-Xms30m -Xmx30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000
		//这种现象原因：虚拟机对于体积不大的对象会优先吧数据分配在TLAB区域中，因此就失去了老年代分配的机会
		//-Xms30m -Xmx30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
		List<byte[]> list=new ArrayList<>();
		for(int i=0;i<5*1024;i++){
			byte[] bs=new byte[1024];
			list.add(bs);
		}
	}
}
