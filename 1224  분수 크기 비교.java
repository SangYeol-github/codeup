/*
분수의 크기를 비교하는 프로그램을 작성하시오.

분수는 a / b  , c / d 모양으로 주어진다.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		if( ( a / b ) > ( c / d ) ) {
			System.out.println(">");
		} else if(( a / b ) == ( c / d )) {
			System.out.println("=");
		} else {
			System.out.println("<");
		}
	}

}
