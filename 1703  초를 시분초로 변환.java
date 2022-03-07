
/*
초를 입력받아 시 / 분 / 초의 형태로 나타내시오.

예)

43    -----> 0 0 43     (0시간 0분 43초)

127  -----> 0 2 7       (0시간 2분 7초)

3602  ----> 1 0 2      (1시간 0분 2초)

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		int m = s/60;
		int h = m/60;
		m %=60;
		s %=60;
		
		System.out.printf("%d %d %d",h,m,s);
	}
}

	
	

