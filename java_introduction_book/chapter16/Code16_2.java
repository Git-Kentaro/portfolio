package chapter16;

import java.util.ArrayList;
import java.util.Iterator;

public class Code16_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> names = new ArrayList<>();
		names.add("湊");
		names.add("菅原");
		names.add("朝香");

	Iterator<String> it = names.iterator();
	while (it.hasNext()) {
		String e = it.next();
		System.out.println(e);
	}
	}

}
