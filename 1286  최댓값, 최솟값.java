
/*
5 개의 정수들의 최댓값과 최솟값을 구하는 프로그램을 작성하라.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int max = -9999999;
		int min = 99999999;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
		System.out.println(max);
		System.out.println(min);
		
	}	

}
