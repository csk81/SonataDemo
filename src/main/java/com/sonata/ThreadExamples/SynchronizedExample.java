package com.sonata.ThreadExamples;

public class SynchronizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne s1 = new ClassOne();
		ClassTwo ob = new ClassTwo(s1);
		ClassThree obj = new ClassThree(s1);
		ob.start();
		obj.start();
	}

}
