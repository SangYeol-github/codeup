
/*
민준이는 뒤늦게 정보 과목의 중요성을 깨닫고 학습실에서 공부를 하고 있다.

기본 공부가 너무 안 되어 있어 아주 쉬운 문제부터 어려움을 겪은 민준이는 친구에게 물어보려고 한다.

가장 잘 하는 친구에게 물어보기는 질문의 내용이 너무 부끄러워 n명의 친구들 중 정보 성적이
 3번째로 높은 친구에게 묻고자 한다.

친구들의 성적은 모두 다르다.

n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] score = new int[n];
		String[] names = new String[n];
		int temp = 0;
		
		for(int i=0; i<score.length; i++) {
			name[i] = sc.next();
			score[i] = sc.nextInt();
			names[i] = name[i] +" " + score[i];
		}
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i]>score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		for(int i=0; i<names.length; i++) {
			if(names[i].contains(String.valueOf(score[2]))) {
				String[] result = names[i].split(" ");
				System.out.println(result[0]);
			}
		}
			
	}
		
}	
	

