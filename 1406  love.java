
/*
영단어 하나가 입력된다.

그 단어가 love이면 I love you. 를 출력하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		if(a.equals("love")) {
			System.out.print("I love you.");
		}
			
	}
		
}	
	

