package com.sonata.JDBCExampleMaven;

import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.model.Employee;
public class App {
	public static void main(String args[]) {
		Employee s1 = new Employee();
		s1.setEmpId(678);
		s1.setEmpName("ramesh");
		s1.setEmpSal(50000);
		EmployeeImpl p1 = new EmployeeImpl();
		int a1 =p1.save(p1);
		System.out.println(a1);
	}
}
