/*
scanf("%s", str);를 사용하면 공백이후의 문자를 입력받지 못한다.

공백이 있는 문자열을 입력받아 출력해보자.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		System.out.println(a);
	}

}
