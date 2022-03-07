
/*
다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
1 2 4 7
3 5 8 10
6 9 11 12

입력이 4 5인 경우는 다음과 같이 출력한다.
1 2 4 7 11
3 5 8 12 15
6 9 13 16 18
10 14 17 19 20

입력이 n m인 경우의 2차원 배열을 출력해보자.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d = 1;
		int sum = a + b;
		
		for(int k=0; k<sum; k++) {
			for(int i=0; i<a; i++) {
				for(int j=0; j<b; j++) {
					if(i+j==k) {
						c[i][j] = d++;
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
	

