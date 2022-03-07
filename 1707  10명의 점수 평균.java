
/*
﻿10명의 프로그래밍 점수를 입력받은 후, 점수의 평균을 구하여 평균보다 높은 사람과 낮은 사람이 각각 몇 명인지 구하는 프로그램을 작성하시오.

(평균과 같은 사람은 평균보다 높은 사람에 포함시킨다.)

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int temp = 0;
		int sum = 0;
		double avg = 0.0;
		int up = 0;
		int down = 0;
		
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			avg = (double)sum/a.length;
		}
		for(int i=0; i<a.length; i++) {
			if(avg<=a[i]) {
				up++;
			} else {
				down++;
			}
		}
		
		
		
		System.out.println(avg);
		System.out.print(up+" "+down);
	}
}

	
	

