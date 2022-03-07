
/*
정수 N을 입력받아 1~N*N까지 2차원 배열에 저장한 후
 사각 테두리에 있는 배열값들만 합하여 출력하시오.

예를 들어) 3을 입력한다면

1 2 3

4 5 6

7 8 9 와 같이 배열에 저장한 후 테두리의 값인
 1+2+3+6+9+8+7+4 = 40을 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int c = 1;
		int sum = 0;
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				b[i][j] = c++; 
			}
		}
		for(int i=0; i<b.length; i++) {
			for(int j=1; j<=b.length; j++) {
				if(i==0 || i== b.length-1 || j==1 || j== b.length) {
					sum += i*b.length + j;
				}
			}
		}
		System.out.println(sum);
			
	}
		
}	
	

