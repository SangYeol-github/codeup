
/*
인터넷 서비스들은 대부분 아이디와 패스워드(password)를 이용한다.

이때 사용되는 패스워드는 여러 가지 방법으로 암호화되어 저장된다.

[어떤 인터넷 서비스의 2가지 암호화 방법]

- 입력받은 문자의 ASCII 코드값 + 2

- (입력받은 문자의 ASCII 코드값 * 7) % 80 + 48

사용자의 패스워드를 2가지 방법으로 암호화한 결과를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		char[] c = a.toCharArray();
		for(int i=0; i<b.length; i++) {
			if(b[i]>=0) {
				b[i]+=2;
			}
		}
			System.out.println(b);
		
		for(int i=0; i<c.length; i++) {
			if (c[i]>=0) {
				c[i] = (char) ((c[i]*7)%80 + 48);
			}
			
		}
			System.out.print(c);
			
	}
		
}	
	

