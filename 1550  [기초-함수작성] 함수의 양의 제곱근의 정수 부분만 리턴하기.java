
/*
양의 정수를 입력 받아 제곱근의 정수 부분만 출력하시오.

어떤 수 n의 제곱근은 제곱하여 n이 되는 수를 말한다. 
예를 들어, 4는 (-2)*(-2) 또는 (2)*(2) 로 만들 수 있고 4의 양의 제곱근은 2를 의미한다.

2의 양의 제곱근은 1.414..... 이다.

단, 함수형 문제이므로 함수 sqrt()만 작성해 제출하시오.


 */

import java.util.Scanner;
public class Main {
	
	static long n;
	static void f(long n) {
		
		long b =  (long) Math.sqrt(n);
		System.out.println(b);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLong();
		
		f(n);
		
			
	}
}

	
	

