/*
태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.

사주를 보는 방법)

세 수(년,월,일)가 주어지면,  (년 + 월 + 일)에 100의 자리 숫자가 짝수이면
 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a+b+c)/100%2==0) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
	}

}
