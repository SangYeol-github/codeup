
/*
﻿ 20글자 이하의 한 단어가 입력되면 뒤집어 출력하시오.

예) love → evol

 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
			
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] token = str.split("");
		
		for(int i=token.length-1; i>=0; i--) {
			System.out.print(token[i]);
		}
	}
}

	
	

