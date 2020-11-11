package com.google.thread;

public class ThreadDemo1 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread--"+i);	
		}
		
	}

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		Thread t=new Thread(td);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main--"+i);	
		}
		
		

	}

}
