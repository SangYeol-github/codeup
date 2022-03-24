
/*
역시 별로 사각형을 출력하는 문제이다.

하지만 여기서는 대각선을 출력해야한다.

프로그램은 다음과 같이 진행된다.

1. n이 입력된다.(3<=n<=100)

2.대각선이 포함된 n*n사각형을 출력한다.

 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				if((i==1)||(j==1)||(i==num)||(j==num)||(i==j)||(i+j==num+1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

	
	


