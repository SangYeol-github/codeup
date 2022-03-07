
/*
어떤 수 a, b가 주어진다.

a와 b의 관계는 a <= b 이다.

a에서 b까지의 수 중 3의 배수만 더하여 출력하시오.

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
			if(a<=b) {
				for(int i=a; i<=b; i++) {
					if(i%3==0) {
						sum += i;
					}
				
				}
			}
		
		System.out.println(sum);
	}	

}
