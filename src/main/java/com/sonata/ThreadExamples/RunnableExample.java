package com.sonata.ThreadExamples;

public class RunnableExample implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" "+"is running");
		}catch(Exception e) {System.out.println(e);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableExample r1 = new RunnableExample();
		Thread t1 = new Thread(r1);
		t1.start();
				
	}
}
