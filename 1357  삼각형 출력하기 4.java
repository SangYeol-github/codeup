
/*
n이 입력되면 다음 삼각형을 출력하시오.

예) n = 4

*
**
***
****
***
**
*
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=a; i++) {
			for(int j=a; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
		
}	
	

