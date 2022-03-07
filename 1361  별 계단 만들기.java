
/*
n이 입력되면 n층의 별 계단을 출력하시오.

예) n= 5인 경우,

**
 **
  **
   **
    **
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.print("**");
			System.out.println();
		}
			
	}
		
}	
	

