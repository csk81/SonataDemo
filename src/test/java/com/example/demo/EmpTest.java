
package com.example.demo;

//import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.employee.Employee;
import com.sonata.impl.EmpImpl;



public class EmpTest {

//@Test
public void yearlySalTest1() {
Employee e1 = new Employee();
e1.setEmpSal(1000);
EmpImpl e2 = new EmpImpl();
Assertions.assertEquals(12000, e2.yearlySal(e1));
}
//@Test
public void yearlySalTest2() {
Employee e1 = new Employee();
e1.setEmpSal(1000);
EmpImpl e2 = new EmpImpl();
Assertions.assertEquals(1200, e2.yearlySal(e1));
}
//@Test
public void aSalTest1() {
Employee e1 = new Employee();
e1.setEmpSal(1000);
EmpImpl e2 = new EmpImpl();
Assertions.assertEquals(5000, e2.appSal(e1));
}
//@Test
public void aSalTest2() {
Employee e1 = new Employee();
e1.setEmpSal(1000);
EmpImpl e2 = new EmpImpl();
Assertions.assertEquals(500, e2.appSal(e1));
}

public static void main(String[] args) {
}

}
