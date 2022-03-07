
/*
입력의 개수 n이 입력되고 n개의  데이터가 입력된다.

이 n개의 데이터 중 최대값을 출력한다.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] b = new int[a];
		int d = 0;
		for(int i=0; i<a; i++) {
			b[i] = scan.nextInt();
		}	
		for(int i=0; i<a; i++) {
			if(d<b[i]) {
				d = b[i];
				}
		}
		System.out.println(d);
	}	

}
