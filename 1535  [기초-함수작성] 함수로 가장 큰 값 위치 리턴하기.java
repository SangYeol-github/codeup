
/*
배열에서 가장 큰 값이 처음 나타나는 위치를 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
	static int n;
	static int[] d = new int[101];
	
	static int f() {
		int max = 0;
		int result = 0;
		for(int i=0; i<n; i++) {
			if(d[i]>max) {
				max = d[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(d[i]==max) {
				result = i+1;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			d[i] = sc.nextInt();
		}
		System.out.println(f());
		
	}
}

	
	

