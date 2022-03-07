/*
두 가지의 참(1) 또는 거짓(0)이 입력될 때, 모두 참일 때는 1이, 
그렇지 않으면 0이 출력되는 프로그램을 작성해보자.

참고)

논리연산자 && 는 주어진 2개의 논리값이 모두 참(1) 일 때에 1(참)으로 계산하고,
이외의 경우에는 0(거짓) 으로 계산한다.

이러한 논리 연산을 AND 연산이라고도 부르고, &&로 표시한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==1&&b==1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
