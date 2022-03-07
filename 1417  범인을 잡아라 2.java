
/*
이번에 또 도둑이 들었다. 도둑으로 판단되는 용의자를 10명을 검거하였다.

CCTV를 정밀 분석한 결과 도둑은 검거한 10명 중 키가 3번째로 크다는 사실을 알았다.

10명의 키를 조사하여 도둑을 검거하는 프로그램을 작성하시오.
 (단, 입력되는 모든 키는 서로 다르다.)
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
		int[] b = new int[10];
		int c =0;
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(b[i]>b[j]) {
					c = b[i];
					b[i] = b[j];
					b[j] = c;
				}
			}
		}
		System.out.println(b[2]);
			
	}
		
}	
	

