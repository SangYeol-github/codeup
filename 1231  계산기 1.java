/*
영민이는 프로그램을 이용하여 계산기를 만들려고한다.

하지만 영민이는 프로그램을 얼마 배우지 않아 어려워하고있다.

우리가 영민이를 위해 계산기 프로그램을 만들어주자.

 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		String[] part = input.split("");
		DecimalFormat df = new DecimalFormat("0.00");
		
		int a = 0, b = 0;
		for(int i=0; i<part.length; i++) {
			try {
				b = Integer.parseInt(part[i]);
			} catch (Exception e) {
				a = i;
			}
		}
		
		String a1 = "";
		String a2 = "";
		
		for(int i=0; i<a; i++) {
			a1 +=part[i];
		}
		for(int i=a+1; i<part.length; i++) {
			a2 +=part[i];
		}
		int input1 = Integer.parseInt(a1);
		int input2 = Integer.parseInt(a2);
		
		switch(part[a]) {
		case "+": System.out.println(input1 + input2); break;
		case "-": System.out.println(input1 - input2); break;
		case "*": System.out.println(input1 * input2); break;
		default : System.out.println(df.format((double)Math.round(((double)input1*100)/(double)input2)/100));
		}
	}	

}
