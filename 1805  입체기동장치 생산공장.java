
/*
입체기동장치 생산공장에서는 거인들을 물리치기 위한 기계가 생산되고 있습니다.

이 공장을 운영하는 에렌은 입체기동장치(1~100)의 식별번호(1~100)와 가스 보유량(0~10000)을 같이 관리하려고 합니다.

하지만, 식별번호를 정렬할 때 가스 보유량이 뒤죽박죽 되어 버려 골머리를 앓고 있습니다.

에렌을 남몰래 좋아하고 있던 미카사는 에렌이 스트레스성 탈모로 잔머리가 모두 빠지기 전에 이 문제를 해결해주려 합니다.

미카사가 에렌의 스트레스성 탈모를 막을 수 있도록 프로그램을 작성해세요.

식별번호가 한번 정해지면 그 입체기동장치의 가스 보유량은 정렬되더라도 변하지 않아야 합니다.
 */


import java.util.Scanner;

class Machine {
	int mNum;
	int gas;
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		Machine[] machines = new Machine[num];

		for (int i = 0; i < num; i++) {
			Machine machine = new Machine();

			machine.mNum = sc.nextInt();
			machine.gas = sc.nextInt();

			machines[i] = machine;
		}

		bubble(machines);

		for (int i = 0; i < machines.length; i++) {
			System.out.println(machines[i].mNum + " " + machines[i].gas);

		}

		sc.close();
	}

	private static void bubble(Machine[] machines) {
		for (int i = 0; i < machines.length; i++) {
			for (int j = 0; j < machines.length - i - 1; j++) {
				if (machines[j].mNum > machines[j + 1].mNum) {
					Machine low = machines[j + 1];
					machines[j + 1] = machines[j];
					machines[j] = low;
				}
			}
		}

	}
}

	
	


