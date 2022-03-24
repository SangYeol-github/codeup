
/*
대각선과 테두리가 그려진 사각형에 가로,세로 중심에 선을 추가하기로 했다.

n이 입력되었을때, 이러한 n*n 사각형을 출력하는 프로그램을 만들자.(단, 3<=n<=99, n은 홀수)
 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				if((i==1)||(j==1)||(i==num)||(j==num)||(i==j)||(i+j==num+1)||(i==num/2+1)||(j == num/2 + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

	
	


