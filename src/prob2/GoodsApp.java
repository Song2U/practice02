package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int COUNT_GOODS = 3; // 상수 정의
		Goods[] ArrayGoods = new Goods[3];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String info = scanner.nextLine();// String에 split이라는 메서드가 있음(기준이 되는 문자열을 써주면 그걸로 쪼갬)-> String 배열로 반환
			String[] infos = info.split(" ");
			for(String s : infos){
				System.out.println(s);
			}
		}
	}
}