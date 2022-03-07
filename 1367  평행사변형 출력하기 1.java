
/*
평행사변형의 높이 n이 주어진다.

옆 면이 대각선으로 이루어지는 평행사변형을 출력한다.

단,공백은 왼쪽 위에 있다.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=a-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<a; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
		
}	
	

