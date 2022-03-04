/*
철수는 대기업의 중요한 업무를 처리하는 부서에 근무하게 되었다. 이 기업은 정보 유출을 막기 위해 근무 장소에 들어갈 때 보안 카드로 신분을 확인한다.

  첫 출근을 한 철수는 보안 카드를 등록하기 위해 보안 카드 자동 등록기에 다음과 같은 정보를 입력해야 한다.

이름, 나이, 부서코드, 보안키

  위 정보가 모두 입력되면 기계에서 보안 카드 접수증을 출력해 주는데, 다음과 같이 이름, 나이, 부서코드, 보안키를 순서대로 줄을 바꿔 출력해야 한다.

mark
20
A
3.154
이 출력 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		double d = sc.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
