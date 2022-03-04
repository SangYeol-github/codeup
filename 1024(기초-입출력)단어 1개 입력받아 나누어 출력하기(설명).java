/*
 단어를 1개 입력받는다.

입력받은 단어(영어)의 각 문자를

한줄에 한 문자씩 분리해 출력한다.
 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int len = a.length();
		for(int i=0; i<a.length(); i++) {
			System.out.printf("\'%c\'\n", a.charAt(i));
		}	
	}

}
