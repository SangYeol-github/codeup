
/*
n개의 숫자가 입력되면,

n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.

예) 1 2 3 4 5가 입력된 경우,

1 2 3 4 5

2 3 4 5 1

3 4 5 1 2

4 5 1 2 3

5 1 2 3 4
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=i; j<b.length; j++) {
				System.out.print(b[j] + " ");
			}
			for(int j=0; j<i; j++) {
				System.out.print(b[j] + " ");
			}
			System.out.println();
		}
			
	}
		
}	
	

