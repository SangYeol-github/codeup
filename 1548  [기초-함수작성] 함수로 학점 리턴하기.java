
/*
다음과 같이, 점수를 입력 받아 학점을 출력하시오.

90 점 이상 ~ 100점 이하 : A
80 점 이상 ~ 90점 미만 : B
70 점 이상 ~ 80점 미만 : C
60 점 이상 ~ 70점 미만 : D
60 점 미만 : F 

단, 함수형 문제이므로 함수 grade()만 작성하여 제출하시오.


 */

import java.util.Scanner;
public class Main {
	
	static int n;
	static void f(int n) {
		
		switch(n/10) {
		case 10: case 9 : System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default : System.out.println("F"); break;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		f(n);
		
			
	}
}

	
	

