
/*
어떤 문자열이 있을 때 문자 t의 위치를 모두 찾아 출력하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		char[] b = a.toCharArray();
		int c =0;
		for(int i=0; i<b.length; i++) {
			if(b[i]=='t') 
				System.out.print(i+1+" ");
		}
			
	}
		
}	
	

