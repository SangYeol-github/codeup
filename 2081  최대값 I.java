
/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오. 
예를 들어, 서로 다른 9개의 자연수 

3, 29, 38, 12, 57, 74, 40, 85, 61 

이 주어지면 이들 중 최대값은 85이고, 이 값은 8번째 수이다.

 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int max = 0;
		int max1 = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);			
//		}
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
				max1 = i;
			}
		}
		
		System.out.println(max);
		System.out.println(max1+1);
		
		
	}
}

	
	


