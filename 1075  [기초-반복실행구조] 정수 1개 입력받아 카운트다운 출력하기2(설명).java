/*
 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=a; i>0; i--) {
			System.out.println(i-1);
		}
	}

}
