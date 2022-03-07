/*
두 실수 a, b가 입력되면 그 두수를 더하거나 빼거나 곱하거나 나누거나 제곱을 해서 가장 큰 수를 출력하시오.

예를 들어 1과 2가 입력되면,

1+2 = 3   , 2+1 = 3

1 - 2 = -1,   2 - 1 = 1

1 * 2 = 2,    2 * 1 = 2

1 / 2 = 0.5,   2 / 1 = 2

12=1 ,   21 = 2

따라서 최댓값은 3이다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c, d, e, f, g, h, i, j, k, l;
		
		c = a + b;
		d = b + a;
		e = a - b;
		f = b - a;
		g = a * b;
		h = b * a;
		i = a / b;
		j = b / a;
		k = Math.pow(a, b);
		l = Math.pow(b, a);
			
		double[] arr = {c, d, e, f, g, h, i, j, k, l};
		double max = arr[0];
		for(int m=0; m<arr.length; m++) {
			if(max<arr[m]) {
				max = arr[m];
			}
		}
		System.out.printf("%.6f",max);
		
	}

}
