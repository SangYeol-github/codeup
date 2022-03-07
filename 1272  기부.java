
/*
근제는 대기업 CSH의 회장이다.

최근 기업의 이미지가 좋지 않아 근제는 가난한 사람들에게 기부를 하려고 한다.

그런데 근제는 특이한 방법으로 기부를 했는데, 기부할 사람들을 번호 순으로 일정한 규칙에 따라 돈을 준다고 한다.

규칙은 다음과 같다

1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120, ...

한편, 가난한 존과 밥은 돈을 받기 위해 신청을 했다.

존의 번호(k), 밥의 번호(h)가 주어질때 존과 밥이 받는 기부금의 합을 구하시오.
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		if(k%2==0) {
			a = k/2*10;
		}
		if(k%2!=0) {
			a = (k + 1) /2;
		}
		if(h%2==0) {
			b = h/2*10;
		}
		if(h%2!=0) {
			b = (h+1)/2;
		}
		System.out.println(a+b);
	}	

}
