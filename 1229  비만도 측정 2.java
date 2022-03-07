/*
키와 몸무게를 이용하여 비만도를 측정할 수 있다.

아래와 같이 표준 몸무게와 비만도 계산법이 있을 때, 비만도를 측정하는 프로그램을 작성하시오.

 

* 표준몸무게

키에 따른 표준몸무게	공식
키가 150 미만일 때	(실제 키 - 100)
키가 150이상 160미만일 때	(실제 키 - 150) /2 + 50
키가 160 이상일 때	(실제 키 - 100) * 0.9
 

* 비만도 계산 공식

비만도 = (실제 몸무게 - 표준몸무게)  * 100 / 표준 몸무게

 

* 비만도에 따른 등급 판정

등급	비만도 수치
 10 이하	정상
10~20 이하	과체중
20 초과	비만
 

예)

키가 150Cm 이고, 몸무게는 60kg이라고 하자.

표준 몸무게 = (150 - 150) / 2 + 50 = 50 kg

비만도 = (60 - 50) * 100 / 50  = 20

따라서 비만도가 20 이므로 "과체중"

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		double tw = 0; //표준몸무게
		
		if(height<150) {
			tw = height -100;
		} else if (height <160) {
			tw = (height - 150)/2 + 50;
		} else {
			tw = (height - 100) * 0.9;
		}
		
		double pig = (weight - tw)*100/tw;
		
		if(pig<=10) {
			System.out.println("정상");
		} else if (pig<=20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
	}

}
