package chapter15;

public class Shorijikan {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long start = System.currentTimeMillis();

//		ここで時間のかかる処理を書く
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}

		String s = sb.toString();
		System.out.println(s);

		long end = System.currentTimeMillis();

		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
	}

}
