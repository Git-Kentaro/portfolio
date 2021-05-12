package chapter9_Practice;

public class Thief {
	String name;
	int hp;
	int mp;

	public Thief(String name, int hp, int mp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Thief(String name, int hp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this(name, hp, 5);
	}

	public Thief(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this(name, 40);
	}
}
