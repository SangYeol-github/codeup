
/*
파파 파스타 가게는 점심 추천 파스타와 생과일 쥬스 세트 메뉴가 인기가 좋다.

이 세트 메뉴를 주문하면 그 날의 3 종류의 파스타와 2 종류의 생과일 쥬스에서 하나씩 선택한다.

파스타와 생과일 쥬스의 가격 합계에서 10%를 더한 금액이 대금된다.

어느 날의 파스타와 생과일 쥬스의 가격이 주어 졌을 때, 그 날 세트 메뉴의 대금의 최소값을 구하는 프로그램을 작성하라.


 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] a = new double[3];
		double[] b = new double[2];
		
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		
		for(int i=0; i<3; i++) {
			a[i] = sc.nextDouble();
				if(a[0]>a[1]) {
					if(a[1]>a[2]) {
						sum1 = a[2];
					} else {
						sum1 = a[1];
					}
				} else if(a[1]>a[2]) {
					if(a[2]>a[0]) {
						sum1 = a[0];
					} else {
						sum1 = a[2];
					}
				} else {
					if(a[0]>a[1]) {
						sum1 = a[1];
					} else {
						sum1 = a[0];
					}
				}
		}
		
		for(int i=0; i<2; i++) {
			b[i] = sc.nextDouble();
				if(b[0]>b[1]) {
					sum2 = b[1];
				} else {
					sum2 = b[0];
				}
		}
		
		sum1 = sum1 + sum1/100*10;
		sum2 = sum2 + sum2/100*10;
		sum3 = sum1 + sum2;
		System.out.println(sum3);
	}

}

	
	


