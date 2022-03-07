
/*
다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
9 10 11 12
8 7 6 5
1 2 3 4

입력이 4 5인 경우는 다음과 같이 출력한다.
20 19 18 17 16
11 12 13 14 15
10 9 8 7 6
1 2 3 4 5

입력이 n m인 경우의 2차원 배열을 출력해보자.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d = a*b;
		
		if(a%2!=0) {
			for(int i=0; i<a; i++) {
				if(i%2==0) {
					for(int j=b-1; j>=0; j--) {
						c[i][j] = d;
						d--;
					}
				} else if(i%2!=0) {
					for(int j=0; j<b; j++) {
						c[i][j] = d;
						d--;
					}
				}
			}
		} else if(a%2==0) {
			for(int i=0; i<a; i++) {
				if(i%2==0) {
					for(int j=0; j<b; j++) {
						c[i][j] = d;
						d--;
					}
				} else if(i%2!=0) {
					for(int j=b-1; j>=0; j--) {
						c[i][j] = d;
						d--;
					}
				}
			}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
			
	}
		
}	
	

