
/*
정수 n이 입력으로 들어오면 1부터 n까지의 합을 구하시오.

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum =0;
		for(int i=1; i<=a; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}	

}
