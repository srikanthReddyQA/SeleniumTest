package Selenium.SeleniumProject;

import org.testng.annotations.Test;

public class Test1 {
	
	//@Test
	public void m1() {
	
	String a ="SSrikanthS";
	String resp="";
	
	for(int i=0;i<a.length();i++) {
		String value= ""+a.charAt(i);
		
		if(!resp.contains(value)) {
			resp=resp+value;
		}
	}
System.out.println(resp);
}
	
//	@Test
	public void array() {
		
		int ar[] = {20,1,4,6,9 ,10,1};
		
		int min =ar[0];
		int max=ar[1];
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]<min) {
				min=ar[i];
			}
			
			
			if(ar[i]>max) {
				max=ar[i];
			}
				
			
		}
		
		System.out.println(min +"--" + max );
	}
	

	public void exce() {
		
		try {
		
		int a =10/0;
		
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(Exception w) {
			System.out.println(w);
		}
		
		
		
	}
	

	public static void main(String arg[]) {
		Test1 t =new Test1();
		t.exce();
	}
		
	
}
