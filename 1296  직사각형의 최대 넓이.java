
/*
길이가 n인 철망을 이용하여 직사각형 모양의 가축 우리를 가능한 한 넓게 만들려고 한다.

이 때 최대 넓이를 정수로 출력하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = a/4;
		double c = b*b;
		System.out.printf("%d",(int)c);
			
	}
		
}	
	

