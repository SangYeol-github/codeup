
/*
nCr은 n개의 원소를 가지는 집합에서 r개의 부분 집합을 고르는 조합의 수를 말한다.

nCr을 일반 공식은 다음과 같다.

nCr=nPrr!=n!r!⋅(n−r)!
5C2는 다음과 같이 구할 수 있다.

5C2=5!3!×2!=5×4×3×2×1/(3×2×1)×(2×1)=10
nCr을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = factorial(a)/(factorial(b)*factorial(a-b));
		System.out.println(result);
		
	}	
	public static int factorial(int num) {
		int sum = 1;
		for(int i=1; i<=num; i++) {
			sum *=i;
		}
		return sum;
	}
	
}
