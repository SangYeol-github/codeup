/*
삼각형의 넓이를 구하는 프로그램을 작성한다.

삼각형의 넓이 = 밑변 * 높이 / 2
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println(a*b/2);
		
	}

}
