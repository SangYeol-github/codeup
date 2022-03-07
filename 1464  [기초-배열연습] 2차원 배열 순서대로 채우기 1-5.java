
/*
다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
12 11 10 9
8 7 6 5
4 3 2 1

입력이 4 5인 경우는 다음과 같이 출력한다.
20 19 18 17 16
15 14 13 12 11
10 9 8 7 6
5 4 3 2 1

입력이 n m인 경우의 2차원 배열을 출력해보자.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int aa = sc.nextInt();
		int[][] b = new int[a][aa];
		int c = a*aa;
		for(int i=0; i<a; i++) {
			for(int j=0; j<aa; j++) {
				b[i][j] = c;
				System.out.print(b[i][j] + " ");
				c--;
			}
			
			
			
			System.out.println();
		}
			
	}
		
}	
	

