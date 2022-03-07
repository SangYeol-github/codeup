
/*
구글 입사 시험으로 1 ~ 1,000,000까지 1의 개수를 묻는 문제가 나온적이 있다.

우리는 이 문제를 풀기에는 아직 힘이 든다.

우리는 이 문제를 조금 쉽게 바꾸어 풀려고한다.

어떤 수 n이 주어지면 1부터 n까지의 수 중
 맨 마지막 자리에 1이 몇 번 들어 있는지 알아내는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b =0;
		for(int i=0; i<=a; i++) {
				if(i%10==1) {
					b++;
			}
			
		}
		System.out.println(b);
	}	

}
