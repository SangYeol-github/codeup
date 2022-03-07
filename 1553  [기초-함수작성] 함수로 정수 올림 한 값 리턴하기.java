
/*
실수(real number)를 입력 받아 정수로 올림해 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성해 제출하시오.

 */

import java.util.Scanner;
public class Main {
	
	static double a;
	
	static long f(double a) {
		long b = (long)a;
		if(b<a) return (long)a+1;
		else  return (long)a;
		
	}
		
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		System.out.print(f(a));
			
	}
}

	
	

