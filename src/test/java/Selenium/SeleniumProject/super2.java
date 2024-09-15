package Selenium.SeleniumProject;

import org.testng.annotations.Test;

public class super2 extends super1{

	
	super2(){
		super(1,26);
		
		System.out.println("123");
	}
	
	
	@Test
public void m2() {
		super.m2();
		String color="redaaa";
		System.out.println(super.color);
		System.out.println("child");
	}
}
