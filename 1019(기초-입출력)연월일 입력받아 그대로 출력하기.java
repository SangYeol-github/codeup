/*년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
 * 입력
 * 연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
 * ex : 2013.8.5
 * 출력
 * 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
 * 
 * */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String number=sc.nextLine();
		String[] a=number.split("\\.");
		System.out.println(String.format("%04d.%02d.%02d", Integer.parseInt(a[0]),
				Integer.parseInt(a[1]) ,Integer.parseInt(a[2])));
	}

}
