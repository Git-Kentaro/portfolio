package chapter11_Practice;

public class Computer extends TangibleAsset{
	String makerName;

//	コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

//	追加メソッド
	public String getMakerName() {
		return this.makerName;
	}
}
