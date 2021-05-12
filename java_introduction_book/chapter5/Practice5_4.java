package chapter5;

public class Practice5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double triangleArea = calcTriangleArea(10.0, 5.0);
		double circleArea = calcCircleArea(5.0);

		System.out.println("三角形の面積：" + triangleArea);
		System.out.println("縁の面積：" + circleArea);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
