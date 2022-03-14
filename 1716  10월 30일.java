
/*
 옛날에 Kninfo라는 나라가 있었다.

이 나라에는 혜인공주가 살고 있었는데, 10월 30일은 혜인공주의 생일이므로 나라에 큰 축제가 열렸다.

이 날은 모든 백성이 쉴 수 있고 즐길수 있는 날이므로 모두들 손꼽아 기다린다.

.

그런데 이 나라는 특이한 나라이므로 다음과 같은 달력을 사용하고 있다.

1. 이 나라는 1월부터 10월까지 있다.

2. 홀수 달은 31일까지 있고, 짝수 달은 30일까지 있다.

.

입력으로 월과 일이 입력되면, 혜인공주의 생일이 몇 일 남았는지 D-DAY를 계산하는 프로그램을 작성하시오.

(연도는 입력되지 않으므로 무조건 입력된 날로 부터 남아있는 날을 계산하여 출력한다.)
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		int num = 0;
		
		if(m!=10) {
			if(m%2==0) {
				num = 30 - d + 1; 
			} else {
				num = 31 -d + 1;
			}
			for(int i=m+1; i<10; i++) {
				if(i%2==0) {
					num +=30;
				} else {
					num +=31;
				}
			}
			num +=29;
		} else {
			num = 30 - d;
		}
			System.out.println(num);
	}
}


