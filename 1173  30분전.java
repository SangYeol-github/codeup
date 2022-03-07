/*
수호는 30분 전으로 돌아가고 싶은 1人 이다.

공백을 기준으로 시간과 분이 주어진다.

그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.

예)

12 35  =====> 12 5

12 0 ======> 11 30

11 5 ======> 10 35
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(b>=30) {
			b = b - 30;
		} else {
			b = (b-30+60);
			if(a>0) {
				a = a-1;
			} else {
				a = 23;
			}
			
		}
		System.out.println(a + " " + b);
		
	}

}
