
/*
길이(글자수)가 100이하인 문자열을 입력받아 공백을 제거하고 출력하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) != ' ') {
				System.out.print(a.charAt(i));
			}
		}
			
	}
		
}	
	

