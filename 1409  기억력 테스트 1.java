
/*
주현이는 5살이라서 아직 기억력이 좋지 않은 편이다.

주현이 엄마는 주현이의 기억력을 향상시키기 위해 매일 훈련을 시킨다.

어느 날, 주현이 엄마는 주현이에게 10개의 숫자를 차례대로 말한 다음 "k번째 숫자는 뭘까요?"하고 물어본다.

이번에는 주현이가 좋아하는 '또봇'이라는 로봇변신 자동차가 상품으로 걸려있다.

주현이가 '또봇'을 가질 수 있도록 프로그래밍하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		System.out.println(a[b-1]);
			
	}
		
}	
	

