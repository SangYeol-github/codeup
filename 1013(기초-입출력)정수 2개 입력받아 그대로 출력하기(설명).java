/*정수(int) 2개를 입력받아 그대로 출력해보자.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("%d %d", a, b);
	}

}
