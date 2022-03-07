/*
10진수 정수를 입력받아 8진수와 16진수로 출력한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.printf("%o %X",a,a);
		
	}

}
