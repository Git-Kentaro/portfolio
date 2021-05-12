package chapter15;

import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());

		Date past = new Date(1600705425287L);
		System.out.println(past);
	}

}
