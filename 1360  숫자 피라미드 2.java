
/*
길이 n이 입력되면 다음과 같은 숫자 피라미드를 출력한다.

예) n이 5이면

5 5 5 5 5

4 4 4 4

3 3 3

2 2

1 
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=a; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				
				System.out.print(a+ " ");
			}
			a--;
			
			
			System.out.println();
		}
			
	}
		
}	
	

