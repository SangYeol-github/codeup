/*
 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
반대로 출력하는 프로그램을 작성해보자.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		if(a==1) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

}
