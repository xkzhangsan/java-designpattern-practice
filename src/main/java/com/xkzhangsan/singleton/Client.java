package com.xkzhangsan.singleton;

public class Client {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			Singleton singleton = Singleton.getSingleton();
			singleton.doSomething();
		}
	}

}
