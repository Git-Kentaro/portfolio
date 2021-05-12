package chapter14_Practice;

import java.util.Random;

public class NewCleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = NewCleric.MAX_HP;
		System.out.println("HPが最大まで回復した！");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");

		Random revision = new Random();
		int recover = sec + revision.nextInt(3);
		int recoverActual = Math.min(NewCleric.MAX_MP - this.mp , recover);
		this.mp += recoverActual;

		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
