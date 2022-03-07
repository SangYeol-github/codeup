
/*
** 을 출력하시오.

단, 함수형 문제이므로 함수 f()만 작성하시오.
 */

public class Main {
	
	public static void main(String[] args)  {
		
		Lamda li = () -> {
			String str = "**";
			System.out.println(str);
		};
		li.print();
	}
}

interface Lamda {
	void print();
}

	
	

