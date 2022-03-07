
/*
어떤 숫자가 입력되면 그 숫자가 몇 자릿수 숫자인지 알아내는 프로그램을 작성하시오.

예)

7   ----> 1   (1자릿수)

10  ----> 2   (2자릿수)

4322 ----> 4   (4자릿수)
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = (int)(Math.log10(a)+1);
		System.out.println(b);
	}	

}
