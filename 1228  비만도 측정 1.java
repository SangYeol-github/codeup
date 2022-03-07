/*
희윤이는 '성문이 두마리 치킨' 가게를 운영하고 있다.

치킨집을 운영하다 보니 매일 치킨을 먹게 되었다.

그러던 어느 날 몸무게를 재어보니 80kg이 나가는 것을 보고 깜짝 놀랐다.

희윤이 여자친구는 비만인 사람을 제일 싫어 하므로 희윤이는 절대 비만이면 안 된다.

희윤이가 비만인지 아닌지 판별하는 프로그램을 작성하시오.

 

* 비만도 계산 공식(브로카의 공식)

항목	공식
표준몸무게 = 	(실제 키 - 100) * 0.9
비만도 = 	
(실제 몸무게 - 표준몸무게)  * 100 / 표준 몸무게

 

* 비만도에 따른 등급 판정

등급	비만도 수치
10 이하	정상
10~20 이하	과체중
20 초과	비만
 

예시)

희윤이의 키는 170.0Cm 이고, 몸무게는 80.0kg이라고 하자.

희윤이의 표준 몸무게 = (170 - 100) * 0.9 = 63 kg

희윤이의 비만도 = (80 - 63) * 100 / 63     = 26.98

따라서 비만도가 26.98이므로 희윤이는 "비만"

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = (a - 100) *0.9;
		double d = (b-c) *100/c;
		
		if(d<=10) {
			System.out.println("정상");
		} else if (d<=20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
	}

}
