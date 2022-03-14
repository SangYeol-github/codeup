
/*
 n개 점의 좌표(x,y)를 입력받아 각 점을 순서대로 연결한 총 거리를 구하는 프로그램을 작성하시오.

단 마지막 점과 첫 번째 점은 연결하지 않는다.
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[100];		
		int[] y = new int[100];		
		
		double length = 0;
		
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			x[i] = a;
			y[i] = b;
		}
		
		for(int i=0; i<num-1; i++) {
			x[i] -= x[i+1];
			y[i] -= y[i+1];
			
			length += Math.sqrt((x[i]*x[i])+(y[i]*y[i]));
		}
		System.out.printf("%.2f",length);
		
	}
}


