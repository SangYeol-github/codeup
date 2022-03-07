
/*
N 개의 데이터가 입력되면, 오름차순된 결과를 출력하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] number = new int[n];
		
		for(int i=0; i<n; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(number);
		
		for(int i : number) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		br.close();
			
	}
		
}	
	

