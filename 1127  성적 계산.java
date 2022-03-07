/*
철수는 자신의 성적을 꼼꼼하게 관리한다.

매번 시험을 치고 나면 자신의 성적을 기록해 놓고 기말고사가 끝나면 중간고사, 기말고사, 수행평가의 점수를 반영비율에 맞게 합산한다.

최근에 프로그래밍 수행평가를 치고 프로그래밍 과목의 점수를 계산하게 되었다.

반영비율을 알고 있고 각각의 점수를 알고 있다면 이 과목의 점수는 다음과 같이 계산할 수 있다.

			중간 고사	기말 고사	수행 평가
반영 비율		30%			30%			40%
받은 점수		86			90			85
0.3 × 86 + 0.3 × 90 + 0.4 × 85 = 86.8

이런 방법으로 전 과목의 점수를 계산해야 한다.

일일이 계산하기 어려우므로 철수는 이 과정을 프로그래밍하기로 하였다.

반영비율과 점수를 알고 있을 때 각 과목의 점수를 계산하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		int b = sc.nextInt();
		double aa = sc.nextDouble();
		int bb = sc.nextInt();
		double aaa = sc.nextDouble();
		int bbb = sc.nextInt();
		
		System.out.printf("%.1f",a*b+aa*bb+aaa*bbb);
		
	}

}
