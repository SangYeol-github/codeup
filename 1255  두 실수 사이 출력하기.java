
/*
소수 둘째 자리의 두 실수 a와 b가 입력으로 주어진다.

a와 b사이의 수를 0.01간격으로 오름차순으로 출력하시오.

예)

5.67 5.73  ==> 5.67 5.68 5.69 5.70 5.71 5.72 5.73

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		while(a<=b) {
			System.out.printf("%.2f ",a);
			a=a+0.01;
		}
	}	

}
