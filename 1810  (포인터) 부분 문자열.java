
/*
어떤 문자열에서 부분문자열을 추출하여 출력하는 프로그램을 작성하시오.

단 배열 대신 동적메모리 할당방법을 사용하시오.
 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		String result = a.substring(num1-1,num2);
		
		System.out.println(result);
		
		
	}

}

	
	


