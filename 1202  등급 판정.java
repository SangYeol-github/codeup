/*
재호는 이번 시험에 받은 성적이 궁금했다.

점수가 입력되면 등급을 출력하시오.

등급)

 90점 이상 : A

80점 이상 : B

70점 이상 : C

60점 이상 : D

60점 미만 : F
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch(a/10) {
		case 10: case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default : System.out.println("F");
		}
		
	}

}
