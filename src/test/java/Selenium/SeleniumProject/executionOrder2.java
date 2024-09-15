package Selenium.SeleniumProject;

public class executionOrder2 extends executionOrder {

	
	
	
	executionOrder2(String name) {
		super(name);
		System.out.println("chhild" +name);
	}

	public void m2() {
		System.out.println("m2 method");
	}
	
	public static void main(String arg[])  {
		executionOrder2 s=	new executionOrder2("sri");
		s.mm1();
		s.m2();
		
	}
	
}
