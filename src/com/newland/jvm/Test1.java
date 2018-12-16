package com.newland.jvm;

public class Test1 {
	
	public static void main(String[] args) {
//-Xms5m -Xmx20m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		byte[] b1=new byte[1*1024*1024];
		System.out.println("=========分配了1M========");
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
	
		
		byte[] b2=new byte[5*1024*1024];
		System.out.println("=========分配了5M========");
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		byte[] b3=new byte[5*1024*1024];
		System.out.println("=========分配了5M========");
		System.out.println("max memory:"+Runtime.getRuntime().maxMemory());
		System.out.println("free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("total memory:"+Runtime.getRuntime().totalMemory());
		
		System.out.println((0x00000000ff2a0000-0x00000000fec00000)/1024);
		System.out.println((0x00000000ff180000-0x00000000fec00000)/1024);
		System.out.println((0x00000000ff080000-0x00000000fec00000)/1024);
		System.out.println((0x00000000fec2d8a0-0x00000000fec00000)/1024);
		
	
	}
}
