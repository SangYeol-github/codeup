
/*
어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.

여기서 입력되는 n은 반드시 홀수이다.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = a/2+1;
		for(int i=1; i<=b; i++) {
			for(int j=b-i-1; j>=0; j--) {
				System.out.print(" ");				
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
		
}	
	

