
/*
어떤 말이든 거꾸로 말하는 앵무새가 있다.

이 앵무새의 특성을 이용하여 사람들이 알아들을 수 있는 말을 하게 하려면 우리가 먼저 거꾸로 말해야 한다.

하지만 거꾸로 말하기란 생각보다 어렵다.

예를 들어 “Hello”라고 말하면 앵무새는 “olleH” 라고 말한다.

앵무새가 바르게 말하게 하려면 우리가 먼저 거꾸로 말을 해야 하므로 매우 불편하다.

이 불편함을 처리할 수 있는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		for(int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
			
	}
		
}	
	

