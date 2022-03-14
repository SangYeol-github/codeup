
/*
범진이는 닷지 게임을 만들기 위해 열공중이다. 닷지 게임은 아래와 같이 미사일을 피하는 게임이다.



여기서 범진이는 아군 비행기와 붉은 점 미사일의 충돌 여부를 프로그래밍 해야 한다.

아군 비행기는 사각형, 미사일은 한 점이며 (x, y)의 좌표가 입력되면 충돌여부를 결정하는 프로그램을 작성하시오. 단, 사각형 꼭지점이나 모서리에 점의 좌표가 일치하는 경우도 충돌한 것으로 본다.

(※ 사각형의 좌표는 왼쪽 아래 꼭지점(x1, y1)과 오른쪽 위 꼭지점(x2, y2)의 좌표가 차례대로 입력된다.)
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		
		 int x1 = sc.nextInt();
		 int y1 = sc.nextInt();
		 
		 int x2 = sc.nextInt();
		 int y2 = sc.nextInt();
		 
		 int x3 = sc.nextInt();
		 int y3 = sc.nextInt();
		 
		 if((x1<=x3) && (x3<=x2) && (y1<=y3) && (y3<=y2)) {
			 System.out.println("충돌");
		 } else {
			 System.out.println("비충돌");
		 }
		 
	}
}


