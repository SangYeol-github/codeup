
/*
다음과 같은 n*n 배열 구조를 출력해보자.

입력이 3인 경우 다음과 같이 출력한다.
3 2 1
4 5 6
9 8 7

입력이 5인 경우는 다음과 같이 출력한다.
5 4 3 2 1
6 7 8 9 10
15 14 13 12 11
16 17 18 19 20
25 24 23 22 21

입력이 n인 경우의 2차원 배열을 출력해보자.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int c = 1;
		
		for(int i=0; i<b.length; i++) {
			if(i%2!=0) {
				for(int j=0; j<b.length; j++) {
					b[i][j] = c;
					c++;					
					}
				}
			if(i%2==0) {
				for(int j=a-1; j>=0; j--) {
					b[i][j] = c;
					c++;
				}
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
			
	}
		
}	
	

