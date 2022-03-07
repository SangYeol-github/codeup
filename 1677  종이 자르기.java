
/*
철수는 인쇄소에서 근무하고 있다. 인쇄소의 주된 업무는
 종이에 문자와 그림을 인쇄하는 것이다. 종이의 종류는 다양하고, 고객마다 요구하는 종이의 크기도 다양하다.

 

인쇄소에는 종이를 크기에 따라 자동으로 잘라주는 최신식 인쇄기가 있다.
 그런데 어느 날 기계가 고장이 난 상태에서 인쇄를 요구하는 고객이 찾아왔고,
  마침 그 고객이 요구하는 크기의 종이도 없어 큰 종이를 수동으로 잘라야 하는 상황이 되었다.

 

철수는 종이를 고객이 요구하는 크기대로 잘라보려고 했으나,
 절취선이 없어 쉽지 않았다.

 

고객이 요구하는 가로, 세로 길이가 주어지면 아주 큰 종이에
 다음과 같은 절취선을 그리는 프로그램을 작성하시오.

 

예를 들어 12*4의 종이라면,

+----------+

|          |

|          |

+----------+

를 출력한다.

 */

import java.util.Scanner;
public class Main {
	
public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==m-1) {
					if(j==0 || j== n-1) {
						System.out.print("+");
					} else {
						System.out.print("-");
					}
				} else if (j==0 || j==n-1) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		
	}
}

	
	

