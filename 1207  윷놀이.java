/*
윷놀이는 4개의 윷을 이용하는 게임이다.

 

도 : 1개가 뒤집어진 상태

개 : 2개가 뒤집어진 상태

걸 : 3개가 뒤집어진 상태

윷 : 4개가 뒤집어진 상태

모 : 하나도 뒤집어지지 않은 상태

 

4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		switch(a+b+c+d) {
		case 0 : System.out.println("모"); break;
		case 1 : System.out.println("도"); break;
		case 2 : System.out.println("개"); break;
		case 3 : System.out.println("걸"); break;
		case 4 : System.out.println("윷"); break;
		}
	}

}
