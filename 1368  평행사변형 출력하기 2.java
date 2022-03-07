
/*
이번엔 공백의 방향까지 정하여 평행사변형을 만들자.

방향 정보는 다음과 같다.

L=왼쪽 아래에 공백

R=오른쪽 아래에 공백

다음 조건에 맞춰 평행사변형을 출력한다.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		
		if(c.equals("L")) {
			for(int i=0; i<a; i++) {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<b; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if(c.equals("R")) {
			for(int i=0; i<a; i++) {
				for(int j=a-1; j>i; j--) {
					System.out.print(" ");
				}
				for(int j=0; j<b; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
			
	}
		
}	
	

