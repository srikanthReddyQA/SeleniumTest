package Selenium.SeleniumProject;

import java.util.Arrays;
import java.util.HashMap;

import org.bouncycastle.jcajce.provider.digest.Whirlpool.HashMac;
import org.testng.annotations.Test;

public class Test22 {

	
//	@Test
	public void rev() {
		
		String x ="I am String working at valuemomentum";
		
		
		String re[] =x.split(" ");
		
		String c="";
		for(int i=re.length-1;i>=0;i--) {
			
			c= c + " " +re[i];
			
			
		}
		System.out.println(c);
	}
	
	
	//@Test
	public void map() {
		HashMap<Integer ,String> map =new HashMap<Integer,String>();
		map.put(1, "sri");
		map.put(1, "kanth");
		
		System.out.println(map);
	}
	
	public void m2() throws ArithmeticException {
		
		try {
		int i= 10/0;
		
		int ar[] = new int [2];
		ar[0]=1;
		ar[1]=1;
		ar[2]=1;
		
		
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch (Exception e) {
			
			System.out.println(e + "---------------" );
		}
		
		
	}
	
	//@Test
	public void m3() {
		
		
		int a[]= {2,5,7,9,4};
		int b []= {3,6,8,1,0};
		
		int temp [] =new int[a.length+b.length];
		
		int index =0;
		for(int i=0;i<a.length;i++) {

			temp[index]=a[i];
			index++;
		}
		for(int j=0;j<b.length;j++) {

			temp[index]=b[j];
			index++;
		}
		
		
		Arrays.sort(temp);
		
		for(int x:temp) {
			System.out.println(x);
		}
		
		
		
		
	}
	
	public void m4() {
	boolean  a[]=new boolean [12];	
		a[0]=false;
		
		
		
		
		System.out.println(a);
	
	
	}
	public static void main(String arg[]) {
		Test22 s =new Test22();
		s.m4();
	}
}
	

