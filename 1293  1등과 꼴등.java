
/*
보람중학교에서는 얼마전 지필평가가 끝났다. 프로그래밍을 가르치는 선생님은 지필평가 전 학생들에게 이런 약속을 하였다.

 

“이번 지필평가에서 1등은 선물을 주고, 꼴등은 벌청소를 시키겠다.”

 

학생들은 지필평가가 끝난 후 프로그래밍 과목의 1등과 꼴등의 점수가 궁금했다. 아직 성적 처리가 되지 않아 아무도 등수를 알지 못한다. 알고 있는 것은 각 학생들의 점수뿐이다.

 

n명의 점수가 입력되면 1등과 꼴등의 점수를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a];
		int c = 100;
		int d = 0;
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
		}	
		for(int i=0; i<a; i++) {	
			if(c>b[i]) {
				c = b[i];
			
			} 
			if(d<b[i]) {
				d = b[i];
			}
		}
		System.out.print(d+" "+c);
			
	}
		
}	
	

