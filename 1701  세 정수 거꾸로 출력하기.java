
/*
세 정수를 입력받아 입력받은 순서의 역순으로 출력하시오.

예)

3 5 4   ----> 4 5 3

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print(a[2]+" " + a[1] + " " +a[0]);
	}
}

	
	

