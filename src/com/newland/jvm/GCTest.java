package com.newland.jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GCTest {
	
	//默认收集器Parallel Scavenge  -XX:+UseParallelGC -XX:+UseParallelOldGC     PS Scavenge/PS MarkSweep
	//CMS垃圾收集器   -XX:+UseConcMarkSweepGC  ParNew/ConcurrentMarkSweep
	//Serial垃圾收集器  -XX:+UseSerialGC Copy/MarkSweepCompact
	//ParNew垃圾收集器 -XX:+UseParNewGC ParNew/MarkSweepCompact     jdk1.8已经弃用
	//G1垃圾收集器  -XX:+UseG1GC   G1 Young Generation/G1 Old Generation
	
	//总结：经过测试ParNew 可以搭配CMS和Serial Old垃圾收集器
	public static void main(String[] args) {
		List<GarbageCollectorMXBean> lists=ManagementFactory.getGarbageCollectorMXBeans();
		for(GarbageCollectorMXBean bean:lists){
			System.out.println(bean.getName());
		}
	}
}
