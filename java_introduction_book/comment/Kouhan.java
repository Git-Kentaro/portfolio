package comment;

//chapter6で使用するクラス
public class Kouhan {
	public static void callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	}

	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目にはいらぬか！");
		Thread.sleep(5000);
		Zenhan.doTogame();
	}
}
