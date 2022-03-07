
/*
두 수를 거꾸로 출력하기..

세 수를 거꾸로 출력하기...

이런 문제들은 쉽게 풀 수 있었다.

이번에는 데이터의 개수가 n개가 들어오고,
 n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.
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
	

