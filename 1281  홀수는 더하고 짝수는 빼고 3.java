
/*
자연수 a, b 사이의 구간에 대해서 홀수는 더하고 짝수는 빼는 식을 보여준 후 결과를 출력하시오.

예)

a=5, b=10 인 경우, 5-6+7-8+9-10=-3

a=6, b=9 인 경우, -6+7-8+9=2
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
					System.out.print("-"+i);
				} else {
					c = c+i;
					if(i==a) {
						System.out.print(i);
					} else {
						
						System.out.print("+"+i);
					}
				}
			}
		}
		System.out.print("="+c);
	}	

}
