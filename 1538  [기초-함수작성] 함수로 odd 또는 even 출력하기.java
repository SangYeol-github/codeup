
/*
odd 또는 even 을 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
	static int a;
	static void f() {
		if(a%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		f();
		
			
	}
}

	
	

