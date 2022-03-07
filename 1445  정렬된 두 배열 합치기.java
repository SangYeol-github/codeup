
/*
정렬된 두 배열을 합쳐서 정렬하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     String input;
	     int arr1size, arr2size;
	     int arr1[], arr2[], result[];
	     
	     input = sc.nextLine();
	     arr1size=Integer.parseInt(input.split(" ")[0]);
	     arr2size=Integer.parseInt(input.split(" ")[1]);
	     
	     arr1=new int[arr1size];
	     arr2=new int[arr2size];
	     result=new int[arr1size + arr2size];
	     
	     input=sc.nextLine();
	     String temp[] = input.split(" ");
	     for(int i=0; i<input.split(" ").length; i++) {
	         arr1[i] = Integer.parseInt(temp[i]);
	     }
	     
	     input=sc.nextLine();
	     temp = input.split(" ");
	     for(int i=0; i < temp.length; i++) {
	         arr2[i] = Integer.parseInt(temp[i]);
	     }
	     
	     int i=0, j=0;
	     while(i + j < arr1size + arr2size) {
	         if((i < arr1size && j < arr2size) && arr1[i] < arr2[j]) {
	             result[i + j]=arr1[i];
	             i++;
	         }else if((i < arr1size && j < arr2size) && arr1[i] >= arr2[j]) {
	             result[i + j] = arr2[j];
	             j++;
	         }else if(i >= arr1size){
	             result[i+j]=arr2[j];
	             j++;
	         }else {
	             result[i+j]=arr1[i];
	             i++;
	         }
	     }
	     
	     for(i=0;i<result.length; i++) {
	         System.out.print(result[i] + " ");
	     }
			
	}
		
}	
	

