
/*
시작 알파벳과 마지막 알파벳을 입력받아 그 두 알파벳 사이의 모든 알파벳을 출력하시오.

예)

a f   ====> a b c d e f  

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
		
//		char c = a;
//		char d = b;
		
		for(int i=a; i<=b; i++) {
			System.out.print((char)i + " ");
		}
	}	

}
