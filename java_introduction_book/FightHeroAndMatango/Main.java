package FightHeroAndMatango;
//スッキリわかるJAVA入門 第8章

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero(); /* 勇者を生成 (Hero型の変数hに、インスタンスを生成し代入) */
		h.name = "ミナト";
		h.hp = 100;

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 30;
		m2.suffix = 'B';

//		冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();

	}

}
