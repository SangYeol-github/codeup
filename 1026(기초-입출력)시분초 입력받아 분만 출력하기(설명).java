/*
 입력되는 시:분:초 에서 분만 출력해보자.
 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(":");
		int b = Integer.parseInt(str[1]);
		
		if(b<=9) {
			System.out.printf("%d",b);
		} else {
			System.out.printf("%1d",b);
		}
	}

}
