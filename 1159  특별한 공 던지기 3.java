/*
슬기는 지난 번에도 공던지기에 져서 아이스크림을 사게되었다.

슬기는 이미 돈이 다 떨어져서 현량이에게 돈을 빌린 상태이다.

이번에는 슬기가 또 다른 조건을 내걸고 체육 선생님에게 도전하게 되었다. 

1. 공의 위치가 50m~70m이면 슬기가 이김.

또는

2. 공의 위치가 6의 배수이면 슬기가 이김. 

슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는
 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if((a>=50&&a<=70)||(a%6==0)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
