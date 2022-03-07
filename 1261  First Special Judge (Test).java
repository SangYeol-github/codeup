
/*
10개의 수가 입력된다.

10개의 수 중 5의 배수를 하나만 출력한다.

만약 5의 배수가 없다면 0을 출력한다.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] a = scan.nextLine().split(" ");
		int b = 0;
		for(int i=0; i<10; i++) {
			b = Integer.parseInt(a[i]);
			if(b%5==0) {
				System.out.println(b);
				break;
			}
		}
		if(b%5 !=0) {
			System.out.println(0);
		}
	}	

}
