
/*
하나의 정수N을 입력받아 다음과 같이 작성하시오.

지그재그로 출력하시오.

N이 5라면 다음과 같이 출력한다.

1 2 3 4 5

10 9 8 7 6

11 12 13 14 15

20 19 18 17 16

21 22 23 24 25
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] c = new int[a][a];
		int d = 1;
		for(int i=0; i<a; i++) {
			if(i%2==0) {
				for(int j=0; j<a; j++) {
					c[i][j] = d;
					d++;
				}	
			} else if(i%2!=0) {
				for(int j=a-1; j>=0; j--) {
					c[i][j] = d;
					d++;
				}
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
	

