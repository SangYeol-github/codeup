/*
 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.

for((반복전 실행/준비 내용); (조건 검사 내용); (한번 실행한 후 처리할 작업))
{ //코드블록
  ...
}
반복 구조를 사용하자.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
			for(int i=0; i<=a ; i++) {
				System.out.print(i + " ");
	
		}
	}

}
