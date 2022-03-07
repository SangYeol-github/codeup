/*
보림이는 엄마와 함께 놋데리아에 갔다.

보림이는 먹고 싶은게 많았으나 엄마가 살찐다고 2가지만 골라서 먹으라고 했다.

그리고 2메뉴의 칼로리 합이 500보다 크면 엄마가 화를 내고, 500이하면 화를 내지 않으신다.

보림이가 선택할 수 있는 메뉴는 다음과 같다.

1. 치즈버거 : 400 칼로리

2. 야채버거 : 340 칼로리

3. 우유 : 170 칼로리

4. 계란말이 : 100 칼로리

5. 샐러드 : 70 칼로리

이 메뉴들 중 2가지 메뉴를 선택했을 때 칼로리 합을 계산하고,
 그 칼로리 합이 500보다 크면 "angry", 500이하면 "no angry"를 출력하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
			switch(a) {
			case 1: c+=400; break; 
			case 2: c+=340; break; 
			case 3: c+=170; break; 
			case 4: c+=100; break; 
			case 5: c+=70; break; 
			}
			switch(b) {
			case 1: d+=400; break; 
			case 2: d+=340; break; 
			case 3: d+=170; break; 
			case 4: d+=100; break; 
			case 5: d+=70; break; 
			}
				if(c+d>500) {
					System.out.println("angry");
				} else {
					System.out.println("no angry");
				}
	}

}
