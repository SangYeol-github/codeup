
/*
XX사에서 만든 디지털 도어락은 내부적으로 보안키 값을 가지고 있고, 이 값은 1,000이하의 자연수로 이루어져 있다.

각 카드키들은 ID값을 가지고 있는데, 이 값이 도어락의 내부 보안키 값의 약수이면 이 도어락을 열 수 있다.

길동이는 ∆∆사에서 근무하고, ∆∆사는 XX사에서 만든 디지털 도어락을 쓴다.

길동이가 자신의 사무실로 가기 위해서는 3개의 문을 통과해야 한다.

길동이는 자신이 통과해야하는 3개의 문의 내부 보안키 값을 알고 있을 때, 이 3개의 문을 모두 열 수 있는 만능 보안키를 여러분에게 의뢰했다.

길동이를 도와주자. 단, 보안키의 ID값이 클수록 제작비용이 적다.

최소한의 비용을 만능보안키를 만드는 프로그램을 작성하시오.

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] d = new int[3];
		int temp = 0;
		
		d[0] = a;
		d[1] = b;
		d[2] = c;
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d.length; j++) {
				if(d[i]>d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		for(int i=d[0]; i>=1; i--) {
			if(d[0] % i==0 && d[1]%i==0 && d[2]%i==0) {
				System.out.println(i);
				break;
			}
		}
		
	}
}

	
	

