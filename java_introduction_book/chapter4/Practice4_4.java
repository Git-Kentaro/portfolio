package chapter4;

import java.util.Scanner;

public class Practice4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {3, 4, 9};

		System.out.print("1桁の数字を入力してください：");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		for (int i : numbers) {
			if (i == input) {
				System.out.println("アタリ！");
			}
		scanner.close();
		}
	}

}
