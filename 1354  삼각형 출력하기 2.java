
/*
길이 n이 입력되면 역삼각형을 출력한다.

예)

n이 5이면

*****
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
			for(int j=a; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
		
}	
	

