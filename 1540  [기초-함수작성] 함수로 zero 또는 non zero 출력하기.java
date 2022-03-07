
/*
zero 또는 non zero 를 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
	static int a;
	static void f() {
		if(a==0) {
			System.out.println("zero");
		} else {
			System.out.println("non zero");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		f();
		
			
	}
}

	
	

