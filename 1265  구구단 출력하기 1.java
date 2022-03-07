
/*
고블린 파이터 동우는 구구단에 관심이 많다.

구구단의 원하는 단을 입력하면 그 단의 구구단이 출력되게 하시오.

예) 3

3*1=3

3*2=6

3*3=9

...

3*9=27
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		mutiple(a);
		
	}
	
	public static void mutiple(int a) {
		for(int i=1; i<=9; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}	

}
