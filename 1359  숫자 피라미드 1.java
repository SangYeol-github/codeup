
/*
길이 n이 입력되면 다음과 같은 숫자 피라미드를 출력한다.

예)

n이 5이면

1

1 2

1 2 3

1 2 3 4

1 2 3 4 5
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 0;
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(j+ " ");
				
			}
			
			System.out.println();
		}
			
	}
		
}	
	

