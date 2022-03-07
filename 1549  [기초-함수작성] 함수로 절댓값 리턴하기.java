
/*
정수를 입력 받아 절댓값을 출력하시오.

단, 함수형 문제이므로 함수 abs()만 작성하여 제출하시오.


 */

import java.util.Scanner;
public class Main {
	
	static long n;
	static void f(long n) {
		
		long b = Math.abs(n);
		System.out.println(b);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		
		f(n);
		
			
	}
}

	
	

