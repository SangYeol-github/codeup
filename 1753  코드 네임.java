
/*
﻿ 어떤 회사에서는 이름을 사용하지 않고 코드네임이라는 것을 사용한다.

이때 코드네임을 만드는 방법이 있는데 자신의 성을 제외한 이름만 영어로 바꾸어서 뒤집어 읽는것이라고 한다.

이 때 n명의 사람의 영어 이름이 입력될 때 n명의 코드네임을 출력하시오.

 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
			
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			String str = sc.nextLine();
			String[] token = str.split("");
			for(int j=token.length-1; j>=0; j--) {
				System.out.print(token[j]);
			}
			System.out.println();
		}
			
	}
}

	
	

