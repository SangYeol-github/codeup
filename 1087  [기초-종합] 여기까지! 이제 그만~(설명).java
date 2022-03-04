/*
1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.

즉, 1부터 n까지 정수를 계속 더한다고 할 때,
어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.

하지만, 이번에는 그 때의 합을 출력해야 한다.

예를 들어 57을 입력하면
1+2+3+...+8+9+10=55에 다시 11을 더해 66이 될 때,
그 값 66이 출력되어야 한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sum =0;
		for(int i=1; i<=a; i++) {
			if(sum< a)
			sum += i;
		}
		System.out.print(sum);
	}

}
