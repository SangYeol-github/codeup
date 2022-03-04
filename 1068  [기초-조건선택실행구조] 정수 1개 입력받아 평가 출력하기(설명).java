/*
 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자..

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch(a/10) {
		case 10: case 9: System.out.println("A"); break;
		case 8 : case 7: System.out.println("B"); break;
		case 6 : case 5: case 4: System.out.println("C"); break;
		default : System.out.println("D");
		}
	}

}
