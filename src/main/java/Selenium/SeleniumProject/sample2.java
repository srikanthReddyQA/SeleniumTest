package Selenium.SeleniumProject;

import java.util.HashMap;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class sample2 {

	//@Test
	public void m2() {
		String s ="aabcdddffd";
	
		for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(s.charAt(i) + "" + count + " ");
        }
        System.out.println();
    }

	
	
	@Test
	public void m3() {
		String s ="aabcdddffd";
		
		

		for (int i = 0; i < s.length(); i++) {
            int count = 1;
            
        	for (int j = i+1; j < s.length(); j++) {
        		
        		if(s.charAt(i) == s.charAt(j)) {
        			count++;
        			i++;
        			
        		}
        		
        	}
        	 System.out.print(s.charAt(i) + "" + count + " ");
		}
		
		
		
	}
	
	
	
	
	
}
