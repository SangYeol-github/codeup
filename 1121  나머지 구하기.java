/*
정수 계산에서 나머지를 구하시오.

예를 들어

7 / 5 의 나머지는 2입니다.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(a%b);
		
	}

}
