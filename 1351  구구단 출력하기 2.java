
/*
시작단과 마지막 단을 입력하면

그 구간의 구구단을 출력하는 프로그램을 작성하시오.

예시)

입력 : 2 3

2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i=a; i<=b; i++) {
			
			if(a==b) {
				for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				}
			} else {
				for(int j=1; j<10; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}
		}
			
	}
		
}	
	

