
/*
5개의 데이터를 입력받아 거꾸로 출력하는 프로그램을 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}

	
	

