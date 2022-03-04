/*2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x, y;
		x = sc.next().charAt(0);
		y = sc.next().charAt(0);
		
		System.out.printf("%c %c", y, x);
	}

}
