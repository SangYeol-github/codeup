/*
섭씨 온도가 입력되면 화씨 온도로 변환하시오.

화씨 온도 = 9 / 5 * 섭씨온도 + 32
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.printf("%.3f",(double)9 / 5 * a +32);
		
	}

}
