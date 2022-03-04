/*
초를 입력받아 분 / 초의 형태로 출력하시오.

예)

60  ====>   1 0    (1분 0초를 뜻함)

70    ====>    1  10       (1분 10초를 뜻함)
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.print(a/60+" ");
		
		if(a>=60) {
			System.out.print(a%60);
		} else {
			System.out.print(a);
		}
		
	}

}
