package com.newland.jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GCTest {
	public static void main(String[] args) {
		List<GarbageCollectorMXBean> lists=ManagementFactory.getGarbageCollectorMXBeans();
		for(GarbageCollectorMXBean bean:lists){
			System.out.println(bean.getName());
		}
	}
}
