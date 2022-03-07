
/*
정수 1개를 입력 받아 0 인 경우 zero, 0 이 아닌 경우 non zero를 판별하여 출력하시오.

단, 함수형 문제이므로 함수 zero()만 작성하시오.


 */

import java.util.Scanner;
public class Main {
	
	static int n;
	static void f(int n) {
		
		if(n==0) {
			System.out.println("zero");
		} else {
			System.out.println("non zero");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		f(n);
		
			
	}
}

	
	

