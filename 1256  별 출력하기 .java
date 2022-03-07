
/*
별(*)을 n개 만큼 출력한다.

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.print("*");
		}
	}	

}
