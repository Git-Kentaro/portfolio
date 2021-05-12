package chapter15_Practice;

public class Practice_15_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		@SuppressWarnings("unused")
		String[] a = s.split(",");
	}
}
