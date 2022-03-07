
/*
다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
12 7 6 1
11 8 5 2
10 9 4 3

입력이 4 5인 경우는 다음과 같이 출력한다.
17 16 9 8 1
18 15 10 7 2
19 14 11 6 3
20 13 12 5 4

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
		
		if(b%2==0) {
			for(int i=0; i<b; i++) {
				if(i%2==0) {
					for(int j=0; j<a; j++) {
						c[j][i] = d;
						d--;
					}
					
				}else if(i%2!=0) {
					for(int j=a-1; j>=0; j--) {
						c[j][i] = d;
						d--;
					}
				}
			}
		} else if(b%2!=0) {
			for(int i=0; i<b; i++) {
				if(i%2==0) {
					for(int j=a-1; j>=0; j--) {
						c[j][i] = d;
						d--;
					}
				} else if(i%2!=0) {
					for(int j=0; j<a; j++) {
						c[j][i] = d;
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
	

