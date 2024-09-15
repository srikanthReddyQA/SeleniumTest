package Selenium.SeleniumProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Pratice {
	
	public static void m2() throws UserDefindException1 {
		int age=2;
		
		if(age<10) {
			
			throw new UserDefindException1("age is not valid");
		}else {
			System.out.println("welcome");
		}
		
	}
	
	public static void main(String arg[]) throws UserDefindException1 {
		
		//m2();
	}
	
	//@Test
public void Dupconunt() {
	
	String x="ssrrmmfg";
	
	HashMap<Character ,Integer> map =new HashMap<Character,Integer>();
	
	for(int i=0;i<x.length();i++) {
		
		char ch=x.charAt(i);
		
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);	
		}else {
			map.put(ch, 1);
		}
		
		
	}
	System.out.println(map);
}
	//@Test
	public void CapitalSamll() {
		
		String xx ="AbCdEf35";
		
		
		for(int i=0;i<xx.length();i++) {
			char ch=xx.charAt(i);
			
			
			if(Character.isUpperCase(ch)) {
				System.out.println(ch+"--uppercase");
			}else if(Character.isLowerCase(ch)){
				System.out.println(ch+"---lowercase");
			}else if(Character.isDigit(ch)) {
				System.out.println(ch+"---Number");
			}
		}
		
	}
	
	//@Test
public void  revirse() {
		
		String xx ="abcd";
		String reversedStr ="" ;
		for(int i=xx.length()-1;i>=0;i--)
		
			reversedStr = reversedStr + xx.charAt(i);    
		
		{
		System.out.println(reversedStr);	
		}
			
	}
	//@Test
public void smallest() {
	int ar[]= {4,2,4,7,820};
	
	int min=ar[0];
	
	for(int i=0;i<ar.length;i++) {
		
		if(ar[i]<min) {
			
			min=ar[i];
		
	}	
	
	}
	
	System.out.println(min);
}
//@Test	
	public void nonrepet() {
		
		int ar[]= {4,2,4,7,2,5};
		
		List<Integer> list =new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					list.add(ar[i]);
				}	
			}
		
		}
		
		for(int i=0;i<ar.length;i++) {
				if(!list.contains(ar[i])) {
					System.out.println(ar[i]);
				
			}
		}
		
		
		
}
	//@Test
public void wordrev() {
		String a ="My name sri";
		String b[]=a.split(" "); 
		String rev=" ";
		for(int i=0;i<b.length;i++) {
			rev=	b[i] +" "+ rev;
			
	
			
		}
		System.out.println(rev);
	
}
//@Test
	public void numrev() {
		
		int number = 123, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  


}
	//@Test
public void dupwords() {
	
	HashMap<String,Integer>map =new HashMap<String,Integer>();
	String x="HI He HI ll";
	
	String y[]=x.split(" ");
	
	for(int i =0;i<y.length;i++) {
		String word=y[i];
		
		if(map.containsKey(word)) {
			map.put(word, map.get(word)+1);
			
		}else {
			map.put(word, 1);
		}

	}
	
	System.out.println(map);
	
	
}
//@Test
	public void Secondhigest() {
		
		int a[]= {1,2,7,19,19,5,8,6};
	int size=a.length;
		Arrays.sort(a);
		
		for(int b:a){
			System.out.println(b);
			
		}
		
		for(int i=0;i<a.length;i++) {
			
		if(a[i]!=a[size-1]) {
			
			
		}
		}
		
			System.out.println("---"+a[size-2]);
			
	//System.out.println(a.length);
	}
	
	@Test
public void prime() {
	
	int num=10;
	int count = 0;
	for(int i=2;i<num;i++) {
		
		if(num%i==0) {
			count++;
		}
		
	}
	
	if(count<1) {
		System.out.println("prime");
	}
	
}
//@Test
public void primenumbers() {
	
	
	for(int i=2;i<100;i++) {
		int count = 0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count++;
			
		}
		}
			if(count<1) {
				System.out.println("prime"+i);
			}
		
		
	}
	
	
	
}
//@Test
public void evenOdd() {
	

	
	for(int i=0;i<10;i++) {
		
		if(i%2==0) {
			System.out.println("even"+i);
		}
	}
}


//@Test	
	public void windown() {
		WebDriver driver = null;
		String parent=driver.getWindowHandle();

		Set <String> s=driver.getWindowHandles();
		//String ar[] =s.toArray(new String[s.size()])
				String[] GPXFILES1 = s.toArray(new String[s.size()] );
				driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(0));
				driver.switchTo().window(GPXFILES1[1]);
	}
	//@Test
	public void Comparelist() {
		
		List s =new ArrayList<String>();
		List s2 =new ArrayList<String>();
		
s.add("a");
s.add("a1");
s.add("a2");
s.add("a3");
		
s2.add("a");
s2.add("a1");
s2.add("a2");
s2.add("a3");

if(s.equals(s2)) {
	System.out.println("list same");
}

int c=0;
for(int i=0;i<s.size();i++) {
	
	for(int j=0;j<s.size();j++) {
		
		if(s.get(i).equals(s2.get(j))) {
			System.out.println("Same elements" +s.get(i) +s2.get(j));
			c++;
		}else {
			System.out.println("not Same elements" +s.get(i) +s2.get(j));
		}
	}
	
}

if(c==s.size()) {
	System.out.println("match");	
}

				
		
	}
	//@Test
	public void compareMap() {
		
		HashMap<String,String> s =new HashMap<String,String>();
		HashMap<String,String> s2 =new HashMap<String,String>();
		
		s.put("name", "s");
		s.put("class", "s2");
		
		s2.put("name", "s");
		s2.put("class", "s2");
		
		if(s.equals(s2)) {
			System.out.println("Map same");
		}

		int count =0;
			 for (Map.Entry<String,String> entry : s.entrySet())  {
				String key= entry.getKey();
				String value= entry.getValue();
				
			if(s2.containsKey(key)&&s2.containsValue(value)) {
				System.out.println(s2.get(key));
				count++;
			}
				
				
			 }
		
		
	}
	
	//@Test
	public void arrayrev() {
		
		int arr[]= {1,2,3,4,5};
		
		  int size = arr.length; 
		  
		  int temp[] = new int[size];   
		  
		  int index = 0;  
		    for(int i = size - 1; i >= 0; i--)  
		    { 
		    	temp[i]=arr[index];
		    	index=index+1;
		    
		    }
		  
		  for(int aa :temp) {
			  System.out.println(aa); 
		  }
		   
	}
	//@Test
	public void removedup() {
		
		String x ="aaBBcC";
		String results="";
		
		for(int i=0;i<x.length();i++) {
		String y=""+x.charAt(i);
		
		if(results.contains(y.toLowerCase()) || results.contains(y.toUpperCase() )) {
			//continue;
		}else {
			results =results+y;
		}
		}
		System.out.println(results);
	}
	@Test
	public void dupArray() {
		
		int ar[]= {1,1,2,2,3,4,5,1};
		
		for(int i=0;i<ar.length;i++)
		{
		for(int j=i+1;j<ar.length;j++) {
			
			if(ar[i]==ar[j]) {
				System.out.println(ar[i]  +"duplicate");
			}
		}
			
			
			
		}
		
		
	}
//	@Test
	public void Dupconuntnum() {
		
		int[] x= {1,4,4,7,7,8};
		
		HashMap<Integer ,Integer> map =new HashMap<Integer,Integer>();
		
		for(int i=0;i<x.length;i++) {
			
			int ch=x[i];
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);	
			}else {
				map.put(ch, 1);
			}
			
			
		}
		System.out.println(map);
	}
	
	@Test
	public void palindrome() {
		
		int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		
		
		if(temp==sum) {
			
			  System.out.println("palindrome number ");    
		} else  {  
			   System.out.println("not palindrome");    
			}  
		
		
		
	}

}