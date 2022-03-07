/*
삼각형의 3변의 길이 a, b, c가 입력으로 주어진다.

여기서 입력되는 변의 관계는 a ≤ b ≤ c 이다. 

그 삼각형이 무슨 삼각형인지 출력하시오.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println("정삼각형");
		} else if((a*a)+(b*b)==(c*c)||(a*a)+(c*c)==(b*b)|| (c*c)+(b*b)==(a*a)) {
			System.out.println("직각삼각형");
		} else if (a+b<=c || a+c<=c || b+c<=a) {
			System.out.println("삼각형아님");
		} else if (a==b||b==c||c==a) {
			System.out.println("이등변삼각형");
		} else if (a+b <c|| a+c<c || b+c < a) {
			System.out.println("삼각형");
		} else if (a<10&& b<c ||b<10&& a<c|| c<10&& a<c) {
			System.out.println("삼각형");
		}
	}

}
