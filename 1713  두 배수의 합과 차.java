/*희용이는 for문을 공부하다가 다음과 같은 프로그램을 생각해냈다.

a부터 b까지의 수 중에서 3의 배수는 더하고, 4의 배수는 빼는 프로그램을 만들어 보자.

만약 그 수가 3과 4의 공배수라면 더하거나 빼는 것을 생략한다.

예)

3 16

---> 3의 배수 = 3, 6, 9, 15 ( 12는 3과 4의 공배수이므로 제외 )

---> 4의 배수 = 4, 8, 16 ( 12는 3과 4의 공배수이므로 제외 )

==> 결과 = 5*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if(a<=b) {
			for(int i=a; i<=b; i++) {
				if(i%3==0) {
					c +=i;
				}
				if(i%4==0) {
					c -=i;
				}
			}
		}
		System.out.println(c);
	}
}


