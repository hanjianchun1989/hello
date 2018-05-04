package com.hello;

public class Demo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("aaaaaaaaa");
		Runnable r=new Runnable() {
			@Override
			public void run() {
				System.out.println("1111");
			}
		};
		Runnable r1=()->{
			System.out.println("bbb");
		};
		new Thread(r).start();
		new Thread(r1).start();
		
	}

}

