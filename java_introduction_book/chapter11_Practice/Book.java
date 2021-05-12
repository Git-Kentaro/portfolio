package chapter11_Practice;

public class Book extends TangibleAsset {
	String isbn;

//	コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}

//	追加メソッド
	public String getIsbn() {
		return this.isbn;
	}
}
