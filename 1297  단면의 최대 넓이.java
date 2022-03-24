
/*
그림과 같이 길이가 n인 철판을 구부려서 단면이 직사각형인 ㄷ자 모양을 만들려고 한다.

이 ㄷ자 모양을 수직으로 자른 단면의 넓이 S를 최대로 하려면 양 끝에서 얼마만큼 구부려야 하는지 계산하시오.
 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if((double)n/4-(n/4)>0.5) {
			System.out.println(n/4+1);
		} else {
			System.out.println(n/4);
		}
		
	}
}

	
	


