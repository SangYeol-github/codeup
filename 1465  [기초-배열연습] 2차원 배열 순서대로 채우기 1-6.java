
/*
다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
9 10 11 12
5 6 7 8
1 2 3 4

입력이 4 5인 경우는 다음과 같이 출력한다.
16 17 18 19 20
11 12 13 14 15
6 7 8 9 10
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
		
		for(int i=0; i<a; i++) {
			for(int j=b-1; j>=0; j--) {
				c[i][j] = d;
				d--;
			}
			
			for(int j=0; j<b; j++) {
				System.out.print(c[i][j]+" ");
			}
			
			System.out.println();
		}
			
	}
		
}	
	

