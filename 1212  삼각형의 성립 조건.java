/*
세 개의 직선이 있다.

숫자의 의미는 직선의 길이를 말한다.

이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성하시오.

삼각형의 성립 조건)

a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면

c < a + b 이면 삼각형이 성립됨.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b&&a>c) {
			if(b+c>a) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} else if (b>a&&b>c) {
			if(a+c>b) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} else {
			if(a+b>c) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

}
