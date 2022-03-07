import java.util.Scanner;

/*
어떤 수 n을 입력으로 받아 1부터 n까지의 숫자를 출력하시오.

 */

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+ " ");
		}
	}	

}
