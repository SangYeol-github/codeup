/*
인학이는 숫자 7을 좋아한다.

어떤 정수가 입력되면 그 수가 7의 배수인지 확인하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%7==0) {
			System.out.println("multiple");
		} else {
			System.out.println("not multiple");
		}
	}

}
