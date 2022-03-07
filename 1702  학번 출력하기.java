
/*
학년, 반, 번호를 입력받는다.

여기서 반이 홀수이면 학번을 한 번 출력하고, 짝수이면 학번을 두 번출력하시오.(학번 학번) <--이런 식

여기서 번호가 10번 미만이어도 그대로 출력한다.

예)

2 1 15 ----> 2115

2 3 8 ----> 238

2 2 2 -----> 222 222

2 4 21 ----> 2421 2421

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		
			if(a[1]%2==0) {
				System.out.print(a[0]+""+a[1]+""+a[2]);
				System.out.print(" "+a[0]+""+a[1]+""+a[2]);
				
			} else {
				System.out.print(a[0]+""+a[1]+""+a[2]);
				
			}
	}
}

	
	

