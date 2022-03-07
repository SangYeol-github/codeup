
/*
한적한 시골마을에 도둑이 들었다.

이 도둑은 마을의 재산을 훔쳐가다 마을 사람들에게 들켜 도망쳤다.

급하게 도망치느라 도둑은 신발이 벗겨졌다는 사실도 잊었다.

마을 사람들은 도둑의 신발의 DNA를 분석했다.

도둑의 DNA의 특징은 DNA의 모든 숫자의 합을 7로 나눈 나머지가 4라는 사실을 알았다.

다음 날 경찰이 도둑으로 의심되는 사람을 검거하여 그들의 DNA 샘플을 가져왔다.

DNA 샘플을 분석하여 이 자가 도둑인지 아닌지를 판단하여 만약 도둑이라면 “suspect”, 
아니면 “citizen”을 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	long num = 0;
        int sum = 0;
        
        num = sc.nextLong();
        
        while(num != 0) {
            sum += num%10;
            num /= 10;
        }
            if(sum%7==4) 
            System.out.println("suspect");
            else
            System.out.println("citizen");
			
	}
		
}	
	

