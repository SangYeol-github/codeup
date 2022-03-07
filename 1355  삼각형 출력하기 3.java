
/*
길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.

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
		for(int i=a; i>0; i--) {
			for(int j=a-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {
				System.out.print("*");
				}
			System.out.println();
			}
			
	}
		
}	
	

