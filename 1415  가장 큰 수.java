
/*
자연수는 홀수와 짝수로 나눌 수 있다.

10개의 자연수가 주어질 때, 홀수들 중 가장 큰 수와 짝수들 중
 가장 큰 수를 구하여 출력하는 프로그램을 작성하시오.
 (단 모든 수가 홀수 혹은 짝수라면 가장 큰 수만 출력한다.)
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] a = new int[10];
		int b =0;
		int c =0;
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i]%2==0) {
				if(a[i]>b) {
					b = a[i];
				}
			}
			if(a[i]%2!=0) {
				if(a[i]>c) {
					c = a[i];
				}
			}
			
		}
		if(c!=0) System.out.printf("%d ", c);
		if(b!=0) System.out.printf("%d",b);
			
	}
		
}	
	

