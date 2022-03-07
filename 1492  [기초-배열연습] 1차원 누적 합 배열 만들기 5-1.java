
/*
n개의 데이터를 배열에 입력 받은 후,

1번째 ~ n번째 데이터까지의 합 배열을 만들고 출력해보자.

5개의 데이터가 다음과 같이 입력되었을 때,

1 2 3 4 5

아래와 같이 출력하면 된다.

1 3 6 10 15


k번째 위치에 저장되어야 하는 값은 다음과 같이 표현할 수도 있다.
s[k] = a[1] + a[2] + s[3]+ ... a[k-2] + a[k-1] + a[k]

같은 의미를 가지는 더 간단한 관계식을 사용할 수는 없을까?
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0; i<a; i++) {
			if(i!= b.length-1) {
				b[i+1] += b[i];
			}
			System.out.print(b[i]+" ");
		}
			
	}
		
}	
	

