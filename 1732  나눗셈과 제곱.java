
/*
정수 a, b 두 개를 입력받아서 출력할 때,

첫째 줄에 a÷b의 소수점 첫째 자리까지 계산한 결과(몫)와

둘째 줄에 소수점 이하를 버린 나눗셈 결과(몫)를 출력하고,

셋째 줄에 ab의 결과를 출력하시오.

예를 들어,

5 2가 입력되면,

2.5
2
25
가 출력되어야 한다.
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		double num1 = Math.round(a/b*100)/100.0;
		double num2 = Math.pow(a,b);
		int num3 = (int)(num1); 
		System.out.printf("%.1f\n",num1);
		System.out.printf("%d\n",num3);
		System.out.printf("%.0f\n",num2);
		
	}
}


