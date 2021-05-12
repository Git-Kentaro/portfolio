package jp.co.f1.superintro.ch8;

import java.util.Scanner;

public class HighAndLowS07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		System.out.println("**************");
		System.out.println("* High & Low *");
		System.out.println("**************");
		System.out.println("");

		while (true) {

			int leftCard = (int)(Math.random()*9)+1;

			System.out.println(" [問題表示]");
			System.out.println("***** *****");
			System.out.println("*   * * * *");
			System.out.println("* " + leftCard +" * * * *");
			System.out.println("*   * * * *");
			System.out.println("***** *****");

			String select;
			while (true) {
				System.out.print("High or Low ?(h/l) ＞");
				select = sc.nextLine();
				if (select.equals("h")) {
					System.out.println("Highを選択しました。");
					break;
				}else if (select.equals("l")) {
					System.out.println("Lowを選択しました。");
					break;
				}else {
					System.out.println("もう１度正しく入力してください。");
				}
				sc.close();
			}

			int rightCard = (int)(Math.random()*9)+1;

			System.out.println("***** *****");
			System.out.println("*   * * * *");
			System.out.println("* " + leftCard + " * * " + rightCard +" *");
			System.out.println("*   * * * *");
			System.out.println("***** *****");

			String result;
			if (leftCard < rightCard) {
				result = "h";
			}else if (leftCard > rightCard) {
				result = "l";
			}else {
				result = select;
			}

			if (result.equals(select)) {
				System.out.println(" →You Win!");
			}else {
				System.out.println(" →You Lose...");
				break;
			}
		}


		System.out.println("");
		System.out.println("--ゲーム終了--");

	}
}
