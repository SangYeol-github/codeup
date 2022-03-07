
/*
주민등록번호가 입력으로 들어온다.( - 대신 공백이 입력됨 )

주민등록번호 뒷자리의 첫번째 숫자가 1이면 1900년대생 남자, 2이면 1900년대생 여자, 3이면 2000년대생 남자, 4이면 2000년대생 여자이다.

올해는 2012년이다. 그 사람의 나이와 성별을 출력하시오.

예시)

790202 1928321   ----> 34 M             (1979년생. 따라서 나이는 34살. 남자)

020111 4421234   ---->  11 F             (2002년생. 따라서 나이는 11살. 여자)

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char b = a.charAt(7);
		String c = a.substring(0, 2);
		int d = Integer.parseInt(c);
		int year = 2012;
		
		if(b=='1' || b=='2') {
			System.out.print((year -1900 -d + 1) +" ");
		} else {
			System.out.print((year -2000 -d + 1) +" ");
			
		}
		
		if(b%2==0) {
			System.out.print("F");
		} else {
			System.out.print("M");
		}
	}
}

	
	

