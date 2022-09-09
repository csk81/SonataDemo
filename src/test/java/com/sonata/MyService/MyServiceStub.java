package com.sonata.MyService;

import java.util.List;
import java.util.Arrays;


public class MyServiceStub implements MyServiceIntf{

	@Override
	public List<String> retrieveUsers(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("learn Spring MVC","Learn Spring","Learn to Dance");
	}
	
	
}
