/*
 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 	String a = sc.next();
		 	char[] arr = a.toCharArray();   
		 		for(int i=0; i<arr.length; i++) {
		 			System.out.print("[" + arr[i]);
		 				for(int j=arr.length-1; j>i; j--) { 
		 					System.out.print("0");          
		 				}
	            System.out.println("]");
	        }
	}

}
