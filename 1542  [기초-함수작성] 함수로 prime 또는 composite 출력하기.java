
/*
prime 또는 composite 중 하나를 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성하시오.


 */

import java.util.Scanner;
public class Main {
	
	static int n;
	static void f(int n) {
		int a = 0;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println("composite");
				a++;
				break;
			}
		}
		if(a==0) {
			System.out.println("prime");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		f(n);
		
			
	}
}

	
	

