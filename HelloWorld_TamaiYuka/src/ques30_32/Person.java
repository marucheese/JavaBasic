package ques30_32;

public class Person {
	//問題１ インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	
	//staticフィールド 人数カウント
	static int count = 0;
	
	//問題２・３・４ コンストラクタ
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //人数をカウント
	}
	
	//問題８・９ 自己紹介を表示するメソッド
	double bmi() {
		return Math.floor(weight/(height*height));
	}
	
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.printf("BMIは%.1fです%n" , this.bmi());
	}
	
	//問題１０ 合計人数を返すメソッド
	static int getCount() {
		return count;
	}
}
