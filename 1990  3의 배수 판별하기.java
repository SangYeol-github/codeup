
/*
자연수 n이 입력되면 3의 배수인지 아닌지 판별하시오.
 */


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
			
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] a = new char[1000];
		
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			a[i] = str.charAt(i);
		}
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		if(sum%3==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}

	
	


