package com.xkzhangsan.proxy;

public class Cilent {
	
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Proxy proxy = new Proxy(subject);
		proxy.request();
	}

}
