/*
어떤 차의 높이가 170cm 이다.

이 차는 3개의 터널 a, b, c를 차례대로 지나게 될 것이다.

각 터널의 높이가 차의 높이(170)보다 같거나 낮으면 차는 터널과 충돌하여 사고가 날 것이다.

각 터널 a, b, c의 높이가 차례대로 3개 입력되면,

터널을 무사히 잘 통과하면 PASS 를 출력하고,
 사고가 난다면 CRASH 와 처음 충돌하는 터널의 높이를 출력하시오.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tunnul1 = sc.nextInt();	
		int tunnul2 = sc.nextInt();	
		int tunnul3 = sc.nextInt();	
			
		int carHeight = 170;
		
		if(tunnul1<=carHeight) {
			System.out.print("CRASH" + " " + tunnul1);
		} else if (tunnul2<=carHeight) {
			System.out.print("CRASH" + " "+ tunnul2);
		} else if (tunnul3<=carHeight) {
			System.out.print("CRASH" + " " + tunnul3);
		} else {
			System.out.println("PASS");
		}
	}

}
