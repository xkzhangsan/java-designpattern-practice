package com.xkzhangsan.proxy;

public class RealSubject implements Subject {
	// 实现方法
	public void request() {
		// 业务逻辑处理
		System.out.println("RealSubject.request");
	}
}
