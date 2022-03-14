/*
 ?에 들어갈 숫자가 무엇인지 알면 IQ 150이라는 문제이다.

원리는 조금만 생각해보면 쉽게 알 수 있다. 따라서 우리는 충분히 IQ 150이라는...

이 상황을 좀 더 일반화하여 각 행의 제일 첫 번째 숫자들만 주어지면 N크기의
 모든 격자판 정보를 출력하는 프로그램을 작성하시오.
 
  */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[][] arr = new int[100][100];
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
				for(int j=0; j<i+1; j++) {
					arr[i][j] = b;
					if(j>=1) {
						arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
					}
				}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println("");
		}
	}
}


