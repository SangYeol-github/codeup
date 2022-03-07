
/*
1부터 n까지의 수 중 짝수의 합을 구하시오.

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum =0;
		for(int i=1; i<=a; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}	

}
