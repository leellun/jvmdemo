package com.newland.jvm;

public class Test4 {
	//-Xss2m
	private static int count=0;
	private static void recursion(){
		count++;
		recursion();
	}
	public static void main(String[] args) {
		try {
			recursion();
		} catch (Throwable e) {
			System.out.println("最大深入："+count);
		}
	}
}
