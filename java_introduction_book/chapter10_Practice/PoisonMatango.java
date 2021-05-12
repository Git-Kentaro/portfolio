package chapter10_Practice;

import chapter9.Hero;

public class PoisonMatango extends Matango {

	public PoisonMatango(char suffix) {
		super(suffix);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	int poisonCount = 5;

	public void attack(Hero h) {
		super.attack(h);

		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばら撒いた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonCount --;
		}

	}

}
