
/*
소수란, 약수가 1과 자기 자신 두 개 뿐인 수를 말한다.

어떤 수가 입력되면 그 수가 소수인지 판단하시오.

예)

2     ====> 소수 (왜냐하면 약수가 1 과 자기자신 2밖에 없기때문..)

3     ====> 소수 (왜냐하면 약수가 1 과 자기자신 3밖에 없기때문..)

4     ====> 소수가 아님 (왜냐하면 약수가 1 , 2 , 4 이기 때문..)

10     ====> 소수가 아님 (왜냐하면 약수가 1 , 2 , 5 , 10 이기 때문..)

11     ====> 소수 (왜냐하면 약수가 1 과 자기자신 11밖에 없기때문..)
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		
		for(int i=1; i<=a; i++) {
			if(a%i ==0) {
				b++;
			} 
		}
		
		if(b == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}	

}
