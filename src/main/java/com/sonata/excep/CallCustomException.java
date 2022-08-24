package com.sonata.excep;

public class CallCustomException {

	public static void main(String[] args) throws MyOwnException{
		// TODO Auto-generated method stub
		int age = 0;
		if (age<18) {
			throw new MyOwnException("age is less than 18");
		}
		else {
			System.out.println("welcome to vote");
		}
	}

}
