
/*
모 드라마의 한 장면에서 어떤 남자가 신의 속도로 코딩을 하면서,

"1줄로 짤 코드를 누가 10줄로 만들어 놓았어요?"

라고 말하는 장면이 프로그래머들 사이에서 주목을 받게 되었다.

다시 보기로 분석한 결과 이 남성이 작성한 코드는
구구단 중 2~5단을 예쁘게 출력하는 클래스인 것으로 확인되었다.

일명 GuguClass !!

이 남자가 작성한 코드의 실행 결과는 다음과 같다.



이 GuguClass와 동일한 결과를 나타내는 프로그램을 작성하시오.

만약 출력문으로만 작성하거나, 코드가 길면 이 남자가 가만히 있을 것 같지 않다!
 */

public class Main {
	
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<6; j++) {
				System.out.printf("%d x %d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
			
	}
		
}	
	

