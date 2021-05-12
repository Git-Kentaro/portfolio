package chapter5;

public class Practice5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String address = "ks.19941611@gmail.com";
		String text = "来週の日曜日に飲み会をしましょう！";

		email(address, text);
	}

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

//	オーバーロードにより、以下のメソッドは使用されない！
	public static void email(String title, String address, String text) {
		System.out.println(address +"に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}
