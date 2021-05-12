package chapter9;

public class Hero {
	String name;
	public int hp = 50;
	Sword sword;

	public void attack() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}

}
