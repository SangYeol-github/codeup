/*
민호는 발명을 되게 좋아하고, 컴퓨터 프로그램도 되게 좋아한다.

어느 날 민호는 컴퓨터를 사용하던 중 휴지통이 꽉 차서 불편을 느꼈다.

그래서 휴지통이 n만큼 차면 알아서 쓰레기를 압축해주는 휴지통을 만들려고 한다.

이 때 압축하는 알고리즘은 다음과 같다.

10의 자릿수와 1의 자릿수를 서로 바꾸고, 거기에 2를 곱한다.

예) 70일 경우 14가 된다.( 70 -> 07 -> 14 )

이 알고리즘은 때로는 부작용을 일으켜 휴지통의 내용이 더 많아 질지도 모른다.

만약 이 알고리즘의 심각한 부작용으로 수치가 100이 넘는다면 100의 자릿수는 무시된다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = new String[2];
		arr = br.readLine().split("");
		int a=0,b=0,c=0;
		
		a= Integer.parseInt(arr[0]);
		b= Integer.parseInt(arr[1]);
		c= Integer.parseInt((String.valueOf(b)+String.valueOf(a)));
		int result = c*2;
		
		String result1 = null;
		
		if(result>=100) {
			result = result - 100;
		}
		if(result>50) {
			result1 = "OH MY GOD";
		} else {
			result1 = "GOOD";
		}
		
		bw.write(String.valueOf(result)+"\n");
		bw.write(result1);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
