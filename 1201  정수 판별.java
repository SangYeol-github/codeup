/*
정수 하나를 입력받아 양수이면 "양수", 음수이면 "음수", 0이면 0을 출력하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
	
			if(a>0) {
				System.out.println("양수");
			} else if(a<0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		
	}

}
