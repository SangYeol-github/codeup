
/*
광곽이는 만우절을 맞이하여 아침에 일어나는 학생들을 위해 모든 기상곡 사이에 “AMOLED”를 집어넣으려 한다.

(단, 마지막에는 AMOLED가 오지 않게 한다. 학생들이 싫어한다.)

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] b = new String[a];
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.next();
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
			if(i==b.length-1) {
				break;
			} else {
				System.out.println("AMOLED");
				
			}
		}
		
	}
}

	
	

