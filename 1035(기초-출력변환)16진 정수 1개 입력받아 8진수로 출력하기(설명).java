/*
 16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String octalNum = sc.nextLine();
		int num = Integer.parseInt(octalNum,16);
		System.out.printf("%o",num);
	}

}
