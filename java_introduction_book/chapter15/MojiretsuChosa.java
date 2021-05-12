package chapter15;

public class MojiretsuChosa {
//文字列調査メソッド
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "Java";

		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3は大文字小文字を区別しなければ等しい");
		}

		System.out.println("s1の長さは" + s1.length() + "です");
	}

}
