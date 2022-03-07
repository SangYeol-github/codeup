
/*
어떤 수 n과 k가 있다.

n과 k의 관계는 다음과 같다.

n^k

n^k는 n을 k번 곱한 것을 말한다.

입력으로 n과 k가 주어지면 결과를 출력한다.

예)

52 = 25

24 = 16
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((int)(Math.pow(a, b)));
	}	

}
