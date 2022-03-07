
/*
팩토리얼(!)은 다음과 같이 정의된다.

n! = n * (n-1) * (n-2) * ... * 2 * 1

즉, 5! = 5 * 4 * 3 * 2 * 1 = 120 이다.

n이 입력되면 n!의 값을 출력하시오.

예)

52 = 25

24 = 16
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =1;
			for(int i=a; i>0; i--) {
				b=b*i;
			}
		System.out.println(b);
	}	

}
