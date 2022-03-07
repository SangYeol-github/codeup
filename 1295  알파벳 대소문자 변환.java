
/*
주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		for(int i=0; i<b.length; i++) {
			if(b[i]>=97) {
				b[i] -= 32;
			} else if(b[i]>=65){
				b[i] += 32;
			} else {
				b[i] +=0;
		}  
			
		}
			System.out.print(b);
			
	}
		
}	
	

