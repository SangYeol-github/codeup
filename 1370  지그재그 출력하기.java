
/*
높이 h와 반복휫수 r이 주어질때, 별을 다음과 같이 지그재그로 출력하자.

예) 3 2

*
 *
  *
 *
*
*
 *
  *
 *
*
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int a = sc.nextInt();
		for(int k=0; k<a; k++) {
		for(int i=0; i<h; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=h-2; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
			
	}
		
}	
	

