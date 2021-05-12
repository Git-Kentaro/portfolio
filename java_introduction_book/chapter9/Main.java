package chapter9;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;

		w.heal(h1); /* ミナト 100 → 110 */
		w.heal(h2); /* アサカ 100 → 110 */
		w.heal(h2); /* アサカ 110 → 120 */
	}

}
