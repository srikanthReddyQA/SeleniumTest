package Selenium.SeleniumProject;

import java.util.HashMap;

import org.testng.annotations.Test;

public class TestString {

	@Test
	public void m2() {
	
		
		  String str ="abcda";
		     HashMap<Character,Integer>map =new HashMap<Character,Integer>();
		     for(int i=0;i<str.length();i++){
		       char ch =  str.charAt(i);
		       
		       if(map.containsKey(ch)){
		           map.put(ch,map.get(ch)+1);
		       }else{
		           map.put(ch,1);
		       }
		         
		     }
		     System.out.println(map);
		    }
		
		
	
}
