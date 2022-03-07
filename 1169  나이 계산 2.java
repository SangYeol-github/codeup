/*
어느 날 한솔이는 혜인이에게 자기가 18살이니 몇 년도에 태어 났는지 맞춰 보라고 했다.

혜인이는 초능력(?)을 발휘해서 한솔이가 몇 년 생인지 한 번에 맞추었다.

한솔이는 깜짝 놀라 셔플 댄스를 추면서 그 자리에서 쓰러지고 말았다.

보다시피 혜인이는 사람의 나이를 알면 출생년도를 마추는 신기한(?) 재주를 가지고 있다.

나이가 주어지면 몇 년도에 태어났는지를 출력하시오. (나이는 2012년도 기준입니다.)

단, 출력할 때 년도 4자리 중 뒤의 두자리만 출력하고, 한 칸 띄운 후
 1900년도 출생이면 1을 출력, 2000년대 출생이면 3을 출력하시오.

예) 18살이면 1995년생이므로 95 1을 출력한다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
//		int b = sc.nextInt();
		int c = 2012;
		
		
		if(a>13) {
			System.out.print((c - a+1)%100);
			System.out.print(" "+1);
		} else {
			System.out.print((c- a+1)%100);
			System.out.print(" "+3);
		}
	}

}
