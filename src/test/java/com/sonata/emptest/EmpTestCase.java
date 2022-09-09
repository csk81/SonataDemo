package com.sonata.emptest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.model.Employee;

class EmpTestCase {
	Employee e1 = new Employee();
	EmployeeImpl p1 = new EmployeeImpl();

	@Test
	void test() {
		e1.setEmpId(111);
		e1.setEmpName("sai");
		e1.setEmpSal(12345);
		Assertions.assertEquals(0 , p1.save(e1));
	}

}
