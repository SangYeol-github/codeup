/*
정수 a, x를 입력받아 a의 값을 x만큼 SHIFT(>>) 연산한 후 결과를 출력하시오.

참고)

비트연산자 >> 은 주어진 a값을 오른쪽으로 x번 이동한 후 결과를 출력한다.

이러한 비트 연산을 SHIFT 연산이라고도 부르고, >>로 표시한다.

예)

4>>1 : 0000 0100 ---> 0000 0010 (10진수:2)

7>>2 : 0000 0111 ---> 0000 0001 (10진수:1)
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a>>b);
	}

}
