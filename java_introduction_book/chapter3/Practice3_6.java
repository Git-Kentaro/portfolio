package chapter3;

import java.util.Random;
import java.util.Scanner;

public class Practice3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("[数当てゲーム]");

		Random random = new Random();
		int ans = random.nextInt(9);

		for (int i = 0; i < 5; i++) {
			System.out.print("0~9の数字を入力してください：");

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();


			if (num == ans) {
				System.out.println("アタリ！");
				break;
			}else {
				System.out.println("違います");
			}

		}
		System.out.println("ゲームを終了します");

	}

}
