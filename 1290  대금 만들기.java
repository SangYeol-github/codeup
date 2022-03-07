
/*
최고의 대금을 만들 수 있는 대나무가 발견되었다.

이 대나무를 최고의 악기로 만들기 위해서는 대나무를 자를 때, 다음과 같은 조건을 만족해야 한다.

대나무의 원래의 길이를 n이라고 할 때, 이 대나무를 어떤 길이로 잘랐을 때 이 길이가 n의 약수이면 이 대나무는 좋은 소리를 내는 악기가 될 수 있다.(단, 반드시 한 번 이상은 잘라야 대금을 만들 수 있다)

대나무의 원래 길이가 주어질 때, 좋은 소리를 내는 서로 다른 대나무 조각의 수를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = 0;
		for(int i=1; i<a; i++) {
			if(a%i==0) {
				b++;
			}
		}
		System.out.println(b);
		
	}	
	
}
