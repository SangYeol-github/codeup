
/*
영어 문장이 입력된다.

그 문장에서 love가 몇 번 나오는지 출력하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		int c =0;
		for(int i=0; i<b.length; i++) {
			if(i !=b.length-3)
			if(b[i]=='l')
				if(b[i+1]=='o')
					if(b[i+2]=='v')
						if(b[i+3]=='e') c++;
				
		}
		System.out.println(c);
			
	}
		
}	
	

