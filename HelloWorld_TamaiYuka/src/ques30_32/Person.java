package ques30_32;

import ques30_32.Vehicle.Bicycle;
import ques30_32.Vehicle.Car;

class Person {
	//インスタンスフィールドにlastNameを追加
	private static int count = 0;
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;
	
	
	//パーソンコンストラクタ
	Person(String firstName, String lastName, int age, double height, double weight) { //lastNameのコンストラクタを追加
		this.firstName = firstName;
		this.lastName = lastName;  //his.lastNameを追加し、lastNameフィールド値を設定
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //count++ を追加
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
		System.out.println();
		System.out.println("以下、課題33");
	}
	
	//問題6 パーソンクラスのインスタンスメソッド「buy」を定義（仮引数：car）
	public void buy(Car car) {
		car.setOwner(this.fullName()); //問題7 buyメソッドの中のsetOwnerメソッドとこれを用いてownerフィールドの値を設定
		System.out.println(car.getOwner() + "が購入しました"); //問題8 「〇〇が購入しました」と出力する処理を追加
	}
	
	//問題9 引数の型が異なるbuyメソッドを定義（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
