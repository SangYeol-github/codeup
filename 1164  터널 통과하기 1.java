/*
어떤 차의 높이가 170cm 이다.

이 차는 3개의 터널을 차례대로 지나게 될 것이다.

터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 날 것이다.

터널의 높이가 차례대로 3개 주어지면 터널을 무사히 잘 통과하면 
PASS 를 출력하고, 사고가 난다면 CRASH 를 출력하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<=170||b<=170||c<=170) {
			System.out.println("CRASH");
		} else {
			System.out.println("PASS");
		}
	}

}
