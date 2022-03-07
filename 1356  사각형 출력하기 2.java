
/*
길이 n이 입력되면 다음과 같은 사각형을 출력한다.

예)

n이 5일때

*****
*   *
*   *
*   *
*****
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i=a; i>0; i--) {
			if(i==a||i==1) {
				for(int j=a; j>0; j--) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for(int k=a-2; k>0; k--) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
		
}	
	

