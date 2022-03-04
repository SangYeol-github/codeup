/*
세 정수가 입력되면 평균을 출력하시오.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("%.2f",(double)(a+b+c)/3);
		
	}

}
