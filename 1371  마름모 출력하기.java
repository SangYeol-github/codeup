
/*
이번엔 마름모를 출력해보자. 

n이 입력되면 대각선 2개의 길이가 2n인 마름모를 출력하시오.
 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=2*n; i++) {
			for(int j=1; j<=2*n; j++) {
				if(i+j == n+1) {
					System.out.print("*");
				} else if(i+j==n+2*i) {
					System.out.print("*");
				} else if(i+j == n+ 2*j) {
					System.out.print("*");
				} else if(i+j == 3*n+1) {
					System.out.print("*");					
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

	
	


