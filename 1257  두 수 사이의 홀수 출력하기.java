
/*
시작수와 마지막 수가 입력되면

시작수부터 마지막 수까지의 모든 홀수를 출력하시오.

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a<=b) {
			for(int i=a; i<=b; i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}
			}
			
		}
	}	

}
