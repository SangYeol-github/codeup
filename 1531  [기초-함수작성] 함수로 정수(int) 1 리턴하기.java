
/*
1 을 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성하시오.
 */

public class Main {
	
	public static void main(String[] args)  {
		
		Lamda li = () -> {
			int a = 1;
			System.out.println(a);
		};
		li.print();
	}
}

interface Lamda {
	void print();
}

	
	

