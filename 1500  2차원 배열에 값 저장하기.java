
/*
n 행 m열의 2차원 배열에 값을 저장하고 출력하려고 한다.

첫째 줄에 2차원 배열의 크기 n과 m을 입력받고,

각각의 데이터를 2차원 배열에 저장한 다음 그대로 출력하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d = 1;
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				c[i][j] = sc.nextInt();
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
	

