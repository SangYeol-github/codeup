/*
 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		switch(a) {
		case "A": System.out.println("best!!!"); break;
		case "B": System.out.println("good!!"); break;
		case "C": System.out.println("run!"); break;
		case "D": System.out.println("slowly~"); break;
		default : System.out.println("what?");
		}
	}

}
