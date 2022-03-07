
/*
gbs라는 개미 투자자가 주식에 투자하려고 합니다.

이 사람이 투자한 돈의 액수와, 그 주식의 하루간의 변동을 퍼센트로 알 때,
 이 사람의 순수익과 이득/손해 판단을 출력하세요.
 
 첫째줄에 투자한 액수 a가 입력됩니다. (100 <= a <= 10,000)

둘째 줄에 투자 일 수 b가 입력됩니다.(1 <= b <= 10)

그 다음줄에 일별 변동폭인 데이터가 날짜 갯수(b개)만큼 퍼센트 정수로 입력됩니다.
 (변동폭는 음수도 될 수 있습니다.) ( 범위 -100 ~ +100)
 
 이 사람의 순수익(=총 수익(최종 값) - 총 비용(투자한 액수))을 소수점 첫째 자리에서 반올림하여 첫째 줄에 출력한다.

그리고 다음 줄에 이 사람이 이득일 경우 "good", 본전일 경우 "same",  손해일 경우 "bad"를 출력하세요. 

물론, 단위가 '원'인데, 0.4원 손해나 0.4원 이득은 없겠죠? (0.5원이면 반올림해서 1입니다 ^^)

만약 0.5>순수익>-0.5이면 순수익은 0으로 봅니다.
 */

import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		int b = sc.nextInt();
		double[] c = new double[b];
		BigDecimal income = new BigDecimal(a);
		int netGain = 0;
		
		for(int i=0; i<b; i++) {
			c[i] = sc.nextInt();
		}
		for(int i=0; i<b; i++) {
			income = income.add(income.multiply(BigDecimal.valueOf(c[i]*0.01)));
		}
		netGain = (int)((Math.round(income.doubleValue()))-a);
		
		String result = (netGain >0) ? "good" : (netGain<0) ? "bad" : "same";
		System.out.printf("%s\n%s",netGain,result);
		
	}	

}
