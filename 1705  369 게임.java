
/*
기은이는 17년 동안 단 한번도 369 게임을 틀리지 않은 369게임의 달인이다.

기은이는 369게임에서 절대 틀리지 않는 탁월한 능력을 가지고 있다.

기은이가 369게임에서 자신의 차례가 되었을때 무엇을 내야 하는지 알아내는 프로그램을 작성하시오.

※ 369게임의 룰은 다음과 같다.

1. 자신의 차례가 되었을 때 숫자에 3이나 6이나 9가 한 번 들어가면 "K"를 출력한다.

2. 만약 숫자에 3이나 6이나 9가 두 번 들어가면 "KK"를 출력한다.

3. 만약 숫자에 3이나 6이나 9가 세 번 들어가면 "KKK"를 출력한다.

4. 이 게임은 숫자 999가 되면 무조건 끝이난다.(더 큰 숫자는 입력되지 않는다.)

5. 그 외의 숫자들은 그냥 그대로 출력한다.

※ 반복문(for, while)을 쓰지 말고 풀기 바랍니다.

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = a;
		int b = 0;
		
		if(a%10==3 ||a%10==6||a%10==9) {
			b++;
		}
		a/=10;
		if(a%10==3 ||a%10==6||a%10==9) {
			b++;
		}
		a/=10;
		if(a%10==3 ||a%10==6||a%10==9) {
			b++;
		}
		
		if(b == 1 ) {
			System.out.println("K");
		} else if (b==2) {
			System.out.println("KK");
		} else if (b==3) {
			System.out.println("KKK");
		} else {
			System.out.println(c);
		}
	}
}

	
	

