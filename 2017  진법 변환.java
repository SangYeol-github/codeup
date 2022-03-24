
/*
두 정수 n과 k가 입력된다.

n을 k진법으로 변환한 결과를 출력하시오.

(진법에 사용되는 수 : 0, 1, ... , 8, 9, A, B, ..., Z 순 입니다.)

 */


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[] arr = new char[28];
		
		for(int i=0; i<arr.length; i++) {
			if(a/b == 0) {
				arr[i] = format(a);
				a = i;
				break;
			}
			arr[i] = format(a%b);
			a /=b;
		}
		
		for(int i=a; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
		
	}
	public static char format(int n) {
		if(n<10) {
			return (char)(n + 48);
		} else {
			return (char)(n + 55);
		}
	}
}

	
	


