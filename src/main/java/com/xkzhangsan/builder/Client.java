package com.xkzhangsan.builder;

public class Client {
	public static void main(String[] args) {
		Product product = new Director().getAProduct();
		product.doSomething();
	}

}
