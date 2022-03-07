/*
지혜는 로또 매니아다.

매주 로또 한장을 사고 토요일이면 대박을 기대하면서 당첨번호를 확인한다.

지혜는 로또 결과가 4등이었는데 확인을 잘못해서 5등인줄 알고 그냥 바꾸기 귀찮아서 버렸었다.

(사실은 다른 줄에 있는 것까지 합쳐서 3개 맞았는데 5등인줄 알았다고 한다.)

이러한 사태가 다시는 일어나지 않게 하기 위해 우리가 프로그램을 만들어 주자.

로또 순위 매기는 방법)

등수	방법
1등	당첨번호 6개 일치
2등	당첨번호 5개 일치 + 보너스번호 일치
3등	5개 번호 일치
4등	4개 번호 일치
5등	3개 번호 일치
꽝	2개 이하 일치
 
예)

13 23 24 35 40 45 7     ===> 로또 당첨번호 + 보너스 번호

 2  6  7 23  40 44      ====> 지혜가 가진 로또 번호

따러서 지혜는 "꽝"

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		int n;
		int correct = 0;
		int bonus = 0;
		String s = "";
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length-1 ; i++) {
			n = sc.nextInt();
				for(int j=0; j<arr.length; j++) {
					if(arr[j]==n) {
						if(j==6) bonus++;
						else correct++;
					}
				}
		}
		
		if(correct<=2) s = "0";
		else if(correct==3) s = "5";
		else if(correct==4) s = "4";
		else if(correct==5&&bonus==0) s = "3";
		else if(correct==5&&bonus==1) s = "2";
		else if(correct==6) s = "1";
		System.out.print(""+s);
	}

}
