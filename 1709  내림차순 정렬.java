
/*
﻿ 데이터를 입력받아 내림차순으로 정렬하는 프로그램을 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
			
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int temp = 0;
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(b[i]>b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}

	
	

