
/*
k개의 숫자를 입력받고 그 숫자들을 두번 출력하시오.

입력 예) 
2
5 7
출력 예)
5
7
5
7
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a];
		for (int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		for(int i= a-1; i>=0; i--) {
			System.out.print(b[i]+ " ");
		}
			
	}
		
}	
	

