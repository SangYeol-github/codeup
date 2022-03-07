/*
1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 결과를 반대로 출력하는 프로그램을 작성해보자.

참고)

C언어에서 비교/관계 연산(==, !=, >, <, >=, <=)이 수행될 때, 0은 거짓(false)을 의미하고, 0이 아닌 모든 수는 참(true)으로 인식한다.

참 또는 거짓의 논리값을 역(반대)로 바꾸기 위해서는 논리(logical) 연산자 ! 를 사용할 수 있다.

이러한 논리 연산을 NOT 연산이라고도 부른다.

참, 거짓의 논리값(boolean value, 불 값을 다루어주는 논리연산자는 !(not), &&(and), ||(or) 이 있다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a==1) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

}
