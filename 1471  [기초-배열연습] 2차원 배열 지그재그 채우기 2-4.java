
/*
다음과 같은 n*n 배열 구조를 출력해보자.

입력이 3인 경우 다음과 같이 출력한다.
3 4 9
2 5 8
1 6 7

입력이 5인 경우는 다음과 같이 출력한다.
5 6 15 16 25
4 7 14 17 24
3 8 13 18 23
2 9 12 19 22
1 10 11 20 21

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
			if(i%2==0) {
				for(int j=a-1; j>=0; j--) {
					b[j][i] = c;
					c++;
				}
			}
			if(i%2!=0) {
				for(int j=0; j<b.length; j++) {
					b[j][i] = c;
					c++;
				}
			}
		}
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
			
	}
		
}	
	

