
/*
초를 입력받아 일 / 시 / 분 / 초의 형태로 나타내시오.

예)

43 -----> 0 0 0 43 (0일 0시간 0분 43초)

127 -----> 0 0 2 7 (0일 0시간 2분 7초)

3600 ------> 0 1 0 0 (0일 1시간 0분 0초)

86402 ----> 1 0 0 2 (1일 0시간 0분 2초)
*/
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		
		 int time = sc.nextInt();
		 
		 int day = time/86400;
		 time -= 86400 * day;
		 
		 int hour = time/(60*60);
		 time -= 3600*hour;
		 
		 int minute = time/60;
		 time -=60*minute;
		 
		 int second = time;
		 
		 System.out.printf("%d %d %d %d",day,hour,minute,second); 
		 
	}
}


