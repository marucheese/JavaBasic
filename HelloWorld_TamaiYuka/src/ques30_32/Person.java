package ques30_32;

class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//問題1 クラスフィールド count を定義
	private static int count = 0;
	
	//パーソンコンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //問題2 クラスフィールド count に1を足す
	}
	
	//問題８・９ 自己紹介を表示するメソッド
	public double bmi() {
		return Math.floor(this.weight / this.height / this.height);
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
	}
	
	//クラスメソッド printCount を定義
	public static void printCount() {
		System.out.println("合計は" + count + "人です"); //問題5「合計〇〇人です」と出力
	}
	
}
