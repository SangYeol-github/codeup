/*
학번을 입력 받아 다음 형식으로 출력하시오.

학번은 학년, 반, 번호로 입력된다.

이번에는 학년은 한자리, 반은 두자리, 번호는 세자리로 출력한다.

예)

2 1 20  ===> 201020  으로 출력

2 2 7 ==> 202007 으로 출력

2 3 100 ==>  203100 으로 출력

2 10 111 ==> 210111 로 출력
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("%d%02d%03d",a,b,c);
		
	}

}
