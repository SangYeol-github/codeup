/*
 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] A = a.split("\\.");
		System.out.printf("%s\n%s",A[0],A[1]);
	}

}
