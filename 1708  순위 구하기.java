
/*
﻿학생의 점수를 입력받아 순위를 구하는 프로그램을 작성하시오.

동점자의 경우 같은 순위를 부여한다.

(예를 들어, 85 100 85 74 점이면, 2등 1등 2등 4등 과 같이 순위가 매겨진다.)

 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
			
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int temp = 1;
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(b[i]<b[j]) {
					temp++;
				}
			}
			System.out.println(b[i] + " " + temp);
			temp =1;
		}
	}
}

	
	

