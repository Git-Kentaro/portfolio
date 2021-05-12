package chapter15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDate {
//String型とDate型の相互変換
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

//		文字列からDateインスタンスを生成
		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);

//		Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
	}

}
