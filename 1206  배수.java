/*
두 자연수 a, b가 주어진다.

b가 a의 배수이면 "a*x=b"를 출력하고,

a가 b의 배수이면 "b*x=a"를 출력하고,

배수관계가 아니면 "none"을 출력하시오.

예) 

5 10    ====> 5*2=10

14 2   ======> 2*7=14

3 7 =====> none
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
		if(b%a==0) {
			c = b/a;
			d = a*c;
			System.out.println(a+"*"+c+"="+d);
		} else if (a%b==0) {
			c = a/b;
			d = b*c;
			System.out.println(b+"*"+c+"="+d);
		} else {
			System.out.println("none");
		}
		System.out.println();
		
	}

}
