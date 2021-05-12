package chapter10_Practice;

import chapter9.Hero;

public class Matango {
	int hp = 50;
	char suffix;

	public Matango(char suffix) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
