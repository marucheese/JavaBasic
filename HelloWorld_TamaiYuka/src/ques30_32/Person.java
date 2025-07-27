package ques30_32;

class Person {
	//問題1 インスタンスフィールドにlastNameを追加
	private static int count = 0;
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;
	
	
	//パーソンコンストラクタ
	Person(String firstName, String lastName, int age, double height, double weight) { //問題2 lastNameのコンストラクタを追加
		this.firstName = firstName;
		this.lastName = lastName;  //問題3 this.lastNameを追加し、lastNameフィールド値を設定
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //問題3 count++ を追加
	}
	
	public String fullName() {
		return this.firstName + this.lastName;
	}
	
	public double bmi() {
		return Math.floor(this.weight / this.height / this.height);
	}
	
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
	}
	
	// printCount を定義
	public static void printCount() {
		System.out.println("合計は" + count + "人です"); 
	}
	
}
