
/*
주사위는 각 면에 1~6까지 적혀 있는 정육면체이다.

이런 주사위 2개를 굴려 합이 k가 나오는 경우를 조사하려고 한다.

예를 들어, 주사위 두개를 굴려 5가 나오는 경우는 1 4, 2 3, 3 2, 4 1 이다.

그리고 주사위를 하나만 굴리는 경우는 없다.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<a; i++) {
			if(i<7 && a-i<7) {
				System.out.print(i);
				System.out.print(" ");
				System.out.print(a-i);
				System.out.println();
			}
		}
			
	}
		
}	
	

