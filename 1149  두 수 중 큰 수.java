/*
두 정수 중 큰 정수를 출력한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

}
