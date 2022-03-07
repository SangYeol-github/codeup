
/*
정수 1개를 입력 받아
양수인 경우 plus, 음수인 경우 minus, 0 인 경우 zero를 판별하여 출력하시오.

단, 함수형 문제이므로 함수 zero()와 plus()만 제출하시오.


 */

import java.util.Scanner;
public class Main {
	
	static int n;
	static void f(int n) {
		
		if(n==0) {
			System.out.println("zero");
		} else if(n>0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		f(n);
		
			
	}
}

	
	

