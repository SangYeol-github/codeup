
/*
영어 공부에 빠져 있는 주현이는 영어 책을 자주 본다.

어느 날 영어 문장을 보면서 어떤 알파벳 문자가 많이 사용되는지 궁금해졌다.

영어 문장이 주어지면 a부터 z까지 알파벳 문자가 각각 몇 번
 나왔는지 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = "abcdefghijklmnopqrstuvwxyz";
		String[] b = a.split("");
		String text = sc.nextLine();
		String[] t = text.split("");
		int[] e = new int[b.length];
		for(int i=0; i<t.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(t[i].equals(b[j])) e[j]++;
				
			}
		}
		for(int i=0; i<e.length; i++) {
			System.out.println(b[i]+":"+e[i]);
		}
			
	}
		
}	
	

