
/*
학교에서 축구대회를 열기로 했다. 본교 학생 수가 많아서 되도록 큰 운동장을 필요로 한다.

학교 근처에 축구를 할 수 있는 운동장이 3개가 있는데 각 운동장의 가로와 세로의 길이를 홈페이지를 통해서 알 수 있었다.

우리는 3개의 운동장 중 가장 큰 운동장을 빌리기로 했다.

이 3개의 운동장 중 가장 넓은 운동장의 넓이를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		int aa = 1;
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			aa *= a[i];
		}
		
		int[] b = new int[2];
		int bb = 1;
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
			bb *= b[i];
		}
		
		int[] c = new int[2];
		int cc = 1;
		for(int i=0; i<c.length; i++) {
			c[i] = sc.nextInt();
			cc *= c[i];
		}
		
		if(aa>bb&&aa>cc) {
			System.out.println(aa);
		} else if (bb>aa&&bb>cc) {
			System.out.println(bb);
		} else {
			System.out.println(cc);
		}
		
	}	
	
}
