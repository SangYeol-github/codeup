
/*
3.14 를 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성하시오.

 */

public class Main {
	
	public static void main(String[] args)  {
		
		Lamda li = () -> {
			double a = 3.14;
			System.out.printf("%.6f",a);
		};
		li.print();
	}
}

interface Lamda {
	void print();
}

	
	

