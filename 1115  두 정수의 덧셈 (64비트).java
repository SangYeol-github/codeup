/*
두 정수의 덧셈의 결과를 출력한다.

두 수는 int 범위를 넘어선 64비트 정수형 값이다.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.print(a+b);
		
	}

}
