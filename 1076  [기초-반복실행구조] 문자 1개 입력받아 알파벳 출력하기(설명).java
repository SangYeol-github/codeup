/*
 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		
			for(int i=97; i<=(int)a ; i++) {
				System.out.print((char)i + " ");
	
		}
	}

}
