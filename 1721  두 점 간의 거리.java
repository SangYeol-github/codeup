
/*
 두 점의 좌표(x,y)를 입력받아 두 점 간의 거리를 구하는 프로그램을 작성하시오.
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int x3 = x2 - x1;
		int y3 = y2 - y1;
		
		double num = Math.sqrt(Math.pow(x3, 2)+Math.pow(y3, 2));
		
		System.out.printf("%.2f",num);
		
		
	}
}


