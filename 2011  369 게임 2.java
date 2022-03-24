
/*
시작 수(a)와 마지막 수(b)가 입력되면 그 범위의 369게임의 올바른 답을 출력하시오.

※ 369게임의 룰은 다음과 같다.

1. 시작수와 마지막수까지의 369게임의 올바른 답을 출력한다.

2. 한 줄에 하나의 결과를 출력한다.

3. 369에 해당될 경우 3이나 6이나 9가 들어간 개수만큼  "K"를 출력한다.

4. 그 외의 숫자들은 그냥 그대로 출력한다.

 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = 0;
		
		for(int i=a; i<=b; i++) {
			num = sam(i);
			if(num==0) {
				System.out.println(i);
			} else {
				for(int j=0; j<num; j++) {
					System.out.print("K");
				}
				System.out.println();
			}
		}

	}
	public static int sam(int n) {
		int c = 0;
		while(n !=0) {
			if((n%10==3) || (n%10==6) || (n%10==9)) c++;
			n /=10;
		}
		return c;
	}
	
}

	
	


