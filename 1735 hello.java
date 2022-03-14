/*
 hello라는 글자를 n번 반복 출력하는 프로그램을 작성하시오.

예를 들어 n이 5가 입력되면, hello를 5줄에 걸쳐 출력한다.
 
  */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			System.out.println("hello");
		}
	}
}


