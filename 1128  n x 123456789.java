/*
n 이 입력되면 n×123456789 의 결과를 출력하시오.

이 문제는 다음 키워드를 사용하지 못한다.

금지 키워드 : long double float
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>=0&&a<=100) {
			
			System.out.println(a*123456789l);
		}
		
	}

}
