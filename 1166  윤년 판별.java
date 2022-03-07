/*
2월이 29일까지 있는 해를 윤년이라고 한다.

어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오.

윤년 판단 조건)

1. 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.


2. 400의 배수이면 윤년.


위 두 조건 중 하나라도 맞으면 윤년이다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		boolean b = (a%4==0 && a%100!=0)||(a%400==0);
		
		if(b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
