package com.newland.jvm;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	public static void main(String[] args) {
		//-Xms30m -Xmx30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000
		//��������ԭ������������������Ķ�������Ȱ����ݷ�����TLAB�����У���˾�ʧȥ�����������Ļ���
		//-Xms30m -Xmx30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
		List<byte[]> list=new ArrayList<>();
		for(int i=0;i<5*1024;i++){
			byte[] bs=new byte[1024];
			list.add(bs);
		}
	}
}
