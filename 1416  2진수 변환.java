
/*
어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.

예)

10    ----->  1010

0    ----->  0

1    ----->  1

2    ----->  10

1024    ----->  10000000000
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		String b = Integer.toBinaryString(a);
		
		System.out.println(b);
			
	}
		
}	
	

