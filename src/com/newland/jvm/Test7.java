package com.newland.jvm;


public class Test7 {
	private static void alloc(){
		byte[] bs=new byte[2];
	}
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		//-XX:+UseTLAB -XX:+PrintTLAB -XX:+PrintGC -XX:TLABSize=102400 -XX:-ResizeTLAB -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis -server
		for(int i=0;i<10000000;i++){
			alloc();
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
}
