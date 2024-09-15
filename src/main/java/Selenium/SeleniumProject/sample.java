package Selenium.SeleniumProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sample {
//@Test
	public void m2() {
		
		//Write code snippet without using any string method- 
		
	String input = "I am learning UI automation";
		
		//Output string = I ma gninrael IU noitamotua";
		String ar[]=input.split(" ");
		int size =ar.length;
		int index=0;
		String xx ="";
		String temp[]= new String [size];
		
		for (int i = 0; i < ar.length; i++) {

			xx = ar[i];

			if (xx.length() > 1) {
              String v ="";
				for (int j = xx.length(); j >0; j--) {

					char ch = xx.charAt(j-1);
					v=v+ch;
					
					temp[i] = v;
					//index=index+1;
				}

			} else {
				temp[i] = ""+xx;
			}
	
		}
		
		String value="";
		for(String xxx :temp) {
			value=value +" " +xxx;
		}
		System.out.println(value);	
	}

@Test(dataProvider ="test-data")
public void nn(String keyWord) {
	System.out.println(keyWord);
	
}

@DataProvider(name = "test-data")
public Object datap() {
	return new Object[][] 
			{{"user"},{"nn"}};
	
	 
	
	
	
}
}
