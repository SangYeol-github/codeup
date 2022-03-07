
/*
실수(real number)를 입력 받아 소수 부분만 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성해 제출하시오.

 */

import java.util.Scanner;
public class Main {
	
	static double a;
	static double f(double a) {
		
		return a - (int)a;
		
	}
		
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		System.out.printf("%.14f",f(a));
			
	}
}

	
	

