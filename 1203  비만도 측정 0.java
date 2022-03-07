/*
비만을 판단하기 위해서 BMI 수치가 필요하다.

BMI 수치가 입력되면 비만을 판단하시오.

* BMI에 따른 비만 판정

BMI 수치	비만 판정
~10 이하	정상
~20 이하	과체중
20 초과	비만
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<=10) {
			System.out.println("정상");
		} else if(a>10&&a<=20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
	}

}
