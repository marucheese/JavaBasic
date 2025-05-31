package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Dog {
	// Q1:フィールドに動物の名前の変数を定義してください。
	public String animal;
	// Q2:フィールドの動物の数の変数をを定義してください。
	public int num;
	// Q3:Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.animal = "犬";
	}
	// Q4:Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int num) {
		this.num = num;
	}
}
	
public class Animal {
	
	public static void main(String[] args) {
		// Q1:Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog anim = new Dog();
		System.out.println("動物の名前　" + anim.animal);
		// Q2:Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog number = new Dog(2);
		System.out.println("動物の数　" + number.num);
		
		//現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime nowDate = LocalDateTime.now(); //現在の日時を取得
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); //表示形式を指定
		String formatNowDate = dtf1.format(nowDate);
		System.out.println(formatNowDate);
	}
}
