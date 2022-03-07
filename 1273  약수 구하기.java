
/*
자연수 N이 주어지면 N의 약수를 오름차순으로 모두 출력하시오.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(a%i ==0) {
				System.out.print(i + " ");
			}
		}
	}	

}
