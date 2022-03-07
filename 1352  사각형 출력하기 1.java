
/*
길이 n이 입력되면 길이가 n인 사각형을 출력하시오.

단, 사각형은 * 모양으로 채운다.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
		
}	
	

