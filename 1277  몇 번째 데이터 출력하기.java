
/*
첫 줄에 데이터의 개수 N(N은 홀수)이 입력되고, 그 다음 줄에 N개의 데이터가 입력된다.

여기서 첫번째 데이터, 중간 데이터, 마지막 데이터를 출력하시오.

예) 

5

2 4 6 1 7

이면

2 6 7

이 출력된다.

(첫번째 데이터 2,

중간 데이터 6,

마지막 데이터 7)
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr[0]+" "+arr[a/2]+" "+arr[a-1]);
	}	

}
