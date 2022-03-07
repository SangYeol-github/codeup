
/*
다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
10 7 4 1
11 8 5 2
12 9 6 3

입력이 4 5인 경우는 다음과 같이 출력한다.
17 13 9 5 1
18 14 10 6 2
19 15 11 7 3
20 16 12 8 4

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
		
		for(int i=0; i<b; i++) {
			for(int j=a-1; j>=0; j--) {
				c[j][i] = d;
				d--;
			}
		}
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
			
	}
		
}	
	

