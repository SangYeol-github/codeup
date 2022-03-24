
/*
구글 입사 시험으로 1 ~ 1,000,000까지 1의 개수를 묻는 문제가 나온적이 있다.

이중 for문을 배웠으니 이 문제를 일반화 시켜 문제를 풀어보자.

시작 수 a와 마지막 수 b가 주어지면 a부터 b까지의 수 중 1이 몇 번 들어 있는지 세는 프로그램을 작성하시오.

(숫자의 어느 위치에든 1이 있으면 개수를 센다)

예)

9 13   ----> 5번  ( 10, 11, 12, 13  : 11은 두번으로 계산)

110 113 ----> 9번 ( 110, 111, 112, 113 : 총 9번)

 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			sum +=goo(i);
		}
		System.out.println(sum);
		
		
		
	}
	public static int goo(int n) {
		int c = 0;
		while(n!=0) {
			if(n%10 ==1) c++;
			n/=10;
		}
		return c;
	}
}

	
	


