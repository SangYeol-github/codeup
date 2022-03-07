
/*
철수는 지난해부터 아버지의 K×K 크기의 인삼밭을 물려받아 농사를 짓고 있다.

어느 날 철수는 인삼밭을 살펴보다가 햇빛 가리개가 설치되어 있지 않다는 것을 알아챘다.

철수는 한창 자라고 있는 인삼에만 햇빛 가리개를 설치하려고 한다.

불행하게도 철수는 인삼 농사를 시작한지 얼마 되지 않아, 인삼이 자랐는지 다 자라지 않았는지 모른다.

철수는 N일 뒤에 택배로 오는 햇빛 가리개를 설치해야 하는 인삼의 개수를 알고 싶어 한다.

우리가 철수를 도와주자. 인삼이 없거나 너무 많이 자라서 농사에 실패한 인삼에는 햇빛 가리개를 설치할 수 없다. 
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int c = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(b[i][j]== -1) {
					continue;
				}
				b[i][j] += c;
				if(b[i][j]>5) {
					continue;
				}
				sum++;
			}
		}
		System.out.println(sum);
			
	}
		
}	
	

