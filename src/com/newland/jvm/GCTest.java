package com.newland.jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GCTest {
	
	//Ĭ���ռ���Parallel Scavenge      PS Scavenge/PS MarkSweep
	//CMS�����ռ���   -XX:+UseConcMarkSweepGC  ParNew/ConcurrentMarkSweep
	//Serial�����ռ���  -XX:+UseSerialGC Copy/MarkSweepCompact
	//ParNew�����ռ��� -XX:+UseParNewGC ParNew/MarkSweepCompact
	//G1�����ռ���  -XX:+UseG1GC   G1 Young Generation/G1 Old Generation
	
	public static void main(String[] args) {
		List<GarbageCollectorMXBean> lists=ManagementFactory.getGarbageCollectorMXBeans();
		for(GarbageCollectorMXBean bean:lists){
			System.out.println(bean.getName());
		}
	}
}
