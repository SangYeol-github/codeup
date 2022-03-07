
/*
길이가 100 이하인 문자열로 구성된 암호문을 발견하였다.

이 암호문은 예전에 작성된 것으로 판단된다.

이 문자열에서 “C”라는 문자와 “CC”라는 문자가 몇 개 있는지 조사하고자 한다.

길이가 100 이하인 문자열을 입력받아, "C"라는 문자와 "CC"라는 문자가
 각각 몇 개 존재하는지 알아내는 프로그램을 작성하시오.
 (단, C, CC는 대소문자를 구분하지 않는다. 즉, "cC"는 "CC"와 같다.)
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		int c = 0;
		int d = 0;
		for(int i=0; i<b.length; i++) {
			if(b[i]=='c'||b[i]=='C') c++;
			if(i !=b.length-1) {
				if ((b[i] == 'c' || b[i] == 'C') &&(b[i+1] == 'c' || b[i+1] == 'C')) d++;
			}
		}
		System.out.println(c);
		System.out.println(d);
			
	}
		
}	
	

