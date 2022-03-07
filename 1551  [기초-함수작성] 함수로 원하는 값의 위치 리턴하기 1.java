
/*
n 개의 정수를 배열로 입력 받고, 
원하는 값 k가 저장되어있는 가장 처음 위치를 출력하시오.
(원하는 값 k값이 저장되어있지 않은 경우에는 –1을 출력한다.)

단, 함수형 문제이므로 함수 f()만 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
static int n,k;
	
	static int[] b = new int[1000010];
	static int f(int k) {
		
		for(int i=0; i<b.length; i++) {
				if(b[i]==k) return i+1;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		k= sc.nextInt();
		
		System.out.println(f(k));
		
			
	}
}

	
	

