/*
주민등록번호는 생년월일과 성별정보, 지역정보로 이루어진다.

여기서 생년월일과 성별정보만 입력으로 받겠다.

성별 정보는 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자,
 3이면 2000년대 출생 남자, 4이면 2000년대 출생 여자를 말한다.

기준년도는 2012년도이다. 현재 나이를 출력하시오. 

예)

790101 1        =====> 성별정보가 1이므로, 1979년생, 34살이다.

080521 4        =====>  성별정보가 4이므로, 2008년생,  5살이다.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 2012;
		if(b==1 || b==2) {
			System.out.println(c - (1900 + a/10000)+1);
		} else {
			System.out.println(c- (2000 + a/10000) +1);			
		}
	}

}
