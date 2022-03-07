
/*
수의 개수 n이 주어지고, 그 다음 줄에 무작위로 n개의 자연수가 입력된다.

그 n개의 수 중에서 짝수의 개수를 출력하시오.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] b = new int[a];
		
		int c = 0;
		for(int i=0; i<a; i++) {
			b[i] = scan.nextInt();
				if(b[i]%2==0) {
					c++;
				}
		}
		System.out.println(c);
	}	

}
