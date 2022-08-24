package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata.two.Calculator;


class DemoApplicationTests {
	Calculator c1 = new Calculator();
	@Test
	public void addTest() {
		
		Assertions.assertEquals(5, c1.add(-5, 10));
	}
	
	@Test
	public void mulTest() {
		
		//Assertions.assertEquals(6, c1.div(2, 3));}
		assertThrows(ArithmeticException.class,()->c1.div(30,0),"it is an error");
	}
		
	@Test
	public void divTest() {
		
		assertThrows(ArithmeticException.class,()->c1.div(1,0),"it is an error");
	}
	@Test
	void contextLoads() {
	}

}