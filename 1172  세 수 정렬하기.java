/*
세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)

예)

5 8 2   ====> 2 5 8    로 출력
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b&&a>=c) {
			if(b>=c) {
				System.out.println(c + " " + b + " " + a);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
		} else if(b>=a&&b>=c) {
			if(a>=c) {
				System.out.println(c + " " + a + " " + b);
			} else {
				System.out.println(a + " " + c + " " + b);
			}
		} else {
			if(a>=b) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(a + " " + b + " " + c);
			}
		}
		
	}

}
