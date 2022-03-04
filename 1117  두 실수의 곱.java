/*
두 실수를 입력받아 두 실수의 곱을 출력하되 소수 둘째자리까지 출력하시오.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.printf("%.2f",a*b);
		
	}

}
