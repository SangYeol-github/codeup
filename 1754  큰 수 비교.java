
/*
우리는 숫자를 int나 long long으로 숫자를 처리하였다.

이번엔 그보다 더 큰 숫자를 비교해보자.

최대 100자리의 두 숫자가 입력되면 작은수와 큰 수를 차례대로 출력하시오.

 */

import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
			
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		BigInteger big1 = new BigInteger(a);
		BigInteger big2 = new BigInteger(b);
		
		if(big1.compareTo(big2)==-1) {
			System.out.println(big1 + " " + big2);
		} else {
			System.out.println(big2 + " " + big1);			
		}
		
			
	}
}

	
	

