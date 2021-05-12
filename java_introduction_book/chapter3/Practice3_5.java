package chapter3;

import java.util.Scanner;

public class Practice3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 ＞ ");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		scanner.close();

		switch(select) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
		case 4:
			System.out.println("変更します");
		}

	}

}
