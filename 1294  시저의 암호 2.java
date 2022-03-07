
/*
※ 씨저의 암호 원리는 앞의 문제를 참고하세요.

 

대현이는 씨저의 암호 방식을 이용하여 문장을 만들려고 한다.

never trust brutus 를 씨저의 암호로 바꾸면 qhyhu wuxvw euxwxv 이다.

 

그런데 집중력이 약한 대현이는 하나 하나 찾아서 암호로 바꾸는데 어려움을 겪고 있다.

우리가 대현이를 위해 평문을 씨저의 암호문으로 바꾸는 프로그램을 만들어주자.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		for(int i=0; i<b.length; i++) {
			if(b[i] != ' ') {
				if(b[i]+3 > 122) {
					switch(b[i]+3) {
					case 123 : b[i]-=23; break;
					case 124 : b[i]-=23; break;
					case 125 : b[i]-=23; break;
					}
				} else {
					b[i] += 3;
				}
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}
			
	}
		
}	
	

