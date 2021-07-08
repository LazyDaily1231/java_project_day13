package 알고리즘;

import java.util.Random;

public class 최소값구하기 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 정렬/검색하는 경우 배열에 집어넣어사
		int[] s = { 90, 80, 20, 60, 70 };

		// 전체를 n번 순회하면서 해당 인덱스까지의 최소값을 변수하나를
		// 정해서 넣어두는 알고리즘

		int min = s[0];// 90, 첫 번째 값을 넣어둔다
		for (int i = 1; i < s.length; i++) {
			// 해당 인덱스에 들어있는 값이 min에 넣어둔 값보다 작으면
			// 해당 인덱스에 들어있는 값을 min에 넣어둠
			if (s[i] < min) {
				min = s[i];
			}
		}
		System.out.println("최소값은:" + min);
		System.out.println("==========================");
		
		// 1~1000까지의 값을 랜덤하게 10000개 만들어서
		// 1.최소값을 찾아보세요
		// 2.개수를 세어보세요
		// 3.위치값을 찾아보세요
		Random r = new Random(100);
		int[] s1 = new int[10000];

		for (int i = 0; i < s1.length; i++) {
			s1[i] = r.nextInt(1000) + 1;
		}

		int min1 = s1[0];
		int count = 0;
		for (int i = 1; i < s1.length; i++) {
			if (s1[i] < min1) {
				min1 = s1[i];
			}
		}
		System.out.println("최소값은:" + min1);

		//String loc = "";
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == min1) {
				count++;
				
			}
			System.out.println("최소값의 갯수는:" + count);
		}

	}
}
