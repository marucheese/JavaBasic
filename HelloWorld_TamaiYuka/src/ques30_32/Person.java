package ques30_32;

class Person {
	//問題１ インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//staticフィールド 人数カウント
	private static int count = 0;
	
	//問題２・３・４ コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //人数をカウント
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
	public static void printCount() {
		System.out.println("合計は" + count + "人です");
	}
	
}
