/*
세 개의 숫자가 주어질 때 작은 순서로 나열 했을 때, 두번째 수를 출력해보자.

예를 들어, 5 9 2 가 있다면, 작은 순서로 나열하면 2 5 9이고 두번째 수는 5이다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			if(b>c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			} 
		} else if (b>a && b>c) {
			if(a>c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if(a>b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}

}
