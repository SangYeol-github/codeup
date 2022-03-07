/*
수호는 30분 전으로 돌아가고 싶은 1人 이다.

공백을 기준으로 시간과 분이 주어진다.

그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.

예)

12 35  =====> 12 5

12 0 ======> 11 30

11 5 ======> 10 35

아직 조건문을 배우지 않았기 때문에 if나 3항연산자를 사용하지 않고 풀기 바랍니다.

금지 키워드 : if ? switch
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a+24)*60+b;
		
		c -= 30;
		
		a = (c/60)%24;
		b = c%60;
		
		System.out.printf("%d %d", a,b);
		
	}

}
