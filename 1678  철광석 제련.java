
/*
광석을 제련하는 공장이 있다. 이 공장에서는 5*5 광석을 채집한 후
 3*3 크기로 자를 수 있는 공구를 이용하여, 3*3 만큼만 채취하여 판매한다.

5*5광석의 각 위치의 가치가 주어질 때,
 가장 가치가 높은 3*3 부분을 찾아 그 가치를 출력하는 프로그램을 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
	static int[][] b = new int[5][5];
	static int valueD(int x, int y) {
		int value = 0;
		for(int i=y; i<y+3; i++) {
			if(i>=5) break;
			for(int j=x; j<x+3; j++) {
				if(j>=5)break;
				value += b[i][j];
			}
		}
		
		return value;
	}
	
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length; j++) {
//				System.out.print(a[i][j] +" ");
//			}
//			System.out.println();
//		}
		int max = 0;
		int temp = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				temp = valueD(i,j);
				if(temp > max) {
					max = temp;
				}
			}
		}
		System.out.println(max);
		
		
			
	}
	
}

	
	

