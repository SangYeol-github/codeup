/*
세 정수가 주어지면 그 중 가장 작은 수를 출력한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = (a<b?b:a)<c?(a<b? a:b):c;	
		
		System.out.println(d);
	}

}
