package com.sonata.ThreadExamples;

public class ThreadJoinExample extends Thread{
	ThreadJoinExample(String s){
		super(s);
	}
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread Executing"+Thread.currentThread());
			}catch(InterruptedException e) {System.out.println(e);}
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ThreadJoinExample t1 = new ThreadJoinExample("one");
		ThreadJoinExample t2 = new ThreadJoinExample("two");
		ThreadJoinExample t3 = new ThreadJoinExample("three");
		t1.start();
		t2.start();
		t3.start();
	}

}
