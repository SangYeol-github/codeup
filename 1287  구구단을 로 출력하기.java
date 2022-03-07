
/*
구구단을 입력받아 *로 출력하라.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=0; j<i*a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	

}
