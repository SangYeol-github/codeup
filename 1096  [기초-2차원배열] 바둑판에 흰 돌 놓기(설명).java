/*
기숙사 생활을 하는 학교에서 어떤 금요일(전원 귀가일)에는 모두 집으로 귀가를 한다.

오랜만에 집에 간 영일이는 아버지와 함께 두던 매우 큰 오목에 대해서 생각해 보다가
"바둑판에 돌을 올린 것을 프로그래밍 할 수 있을까?"하고 생각하였다.

바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] arr = new int[19][19];
		
		for(int i=0; i<a; i++) {
			int xx = sc.nextInt();
			int yy = sc.nextInt();
			for(int x=0; x<arr.length; x++) {
				for(int y=0; y<arr.length; y++) {
					arr[xx-1][yy-1] = 1;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			for( int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
