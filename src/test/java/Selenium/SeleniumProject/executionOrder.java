package Selenium.SeleniumProject;

public class executionOrder {
	
	
	
	static{
		System.out.println("Static block ");
		
	}
	
	executionOrder(String name){
		super();
	System.out.println(" 0 constructor block "+name );
	}
	
	public void   mm1() {
		
		System.out.println(" method m1 ");
	}

	{
		System.out.println("Instance block");
	}
}