
/*
우리는 1부터 N까지의 숫자가 차례대로 적힌 N장의 카드 묶음을 가지고 있다.

그런 데 이 카드 묶음을 옮기는 중 실수로 땅에 떨어뜨려 그 중 한 장을 잃어버렸다.

여러 분은 땅에 떨어진 카드 묶음을 읽어서 빠진 하나의 카드 번호를 찾아 출력해야 한다.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n-1];
		int[] b = new int[n];
		int aa=0, bb=0;
		for(int i=0; i<a.length; i++) a[i]=sc.nextInt();
		for(int i=0; i<b.length; i++) b[i]=i+1;
		for(int i=0; i<a.length; i++) aa +=a[i];
		for(int i=0; i<b.length; i++) bb +=b[i];
		System.out.println(bb-aa);
			
	}
		
}	
	

