
/*
용준이와 봉찬이는 분수를 아는 학생이다.ㅋ

분수 공부를 하다가 기약분수로 만드는 프로그램을 만들기로 했다.

분자, 분모가 입력되면 기약분수의 형태로 출력하는 프로그램을 작성하시오.

.

※ 기약분수 : 더 이상 약분할 수 없는 분수이다.

예를 들어 5 / 25 를 기약분수로 바꾸면 1 / 5 이다. 

 5     5로 나눈다        1
---  ---------------->  ---
25     5로 나눈다        5
이 순서로 으로 기약분수가 된다.
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 if(b%a == 0) {
			 System.out.printf("1 %d", b/a);
			 return;
		 }
		 
		 for(int i=a/2; i>1; i--) {
			 if(b%i==0&&a%i==0) {
				 System.out.printf("%d %d",a/i,b/i);
				 return;
			 }
		 }
		 System.out.printf("%d %d", a, b);
	}
}


