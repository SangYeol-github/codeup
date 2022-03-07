
/*
하나의 정수 N을 입력받아 다음과 같이 지그재그로 출력하시오.

N이 3이라면,

1 6 7

2 5 8

3 4 9
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int c = 1;
		
		for(int i=0; i<a; i++) {
			if(i%2==0) {
				for(int j=0; j<a; j++) {
					b[j][i] = c;
					c++;
				}
			} else if(i%2!=0) {
				for(int j=a-1; j>=0; j--) {
					b[j][i] = c;
					c++;
				}
			}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
			
	}
		
}	
	

