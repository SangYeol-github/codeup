
/*
n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.

입력 예)

3
출력 예)
1 4 7
2 5 8
3 6 9
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] c = new int[a][a];
		int d = 1;
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				c[j][i] = d;
				d++;
			}
		}
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
			
	}
		
}	
	

