
/*
두 자연수 a, b 사이의 구간에 대해서

홀수는 더하고 짝수는 뺀다음의 합을 출력하시오.

예)

a = 5, b=10 일 경우, 5 - 6 + 7 - 8 + 9 - 10 = -3
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if(a<=b) {
			for(int i=a; i<=b; i++) {
				if(i%2==0) {
					c = c-i;
				} else {
					c = c+i;
				}
			}
		}
		System.out.println(c);
	}	

}
