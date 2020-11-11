package com.google.thread;

public class ThreadDemo extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread--"+i);	
		}
		
	}

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main--"+i);	
		}
		
		

	}

}
