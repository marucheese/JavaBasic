package ques30_32;

import ques30_32.Vehicle.Bicycle;
import ques30_32.Vehicle.Car;

class Main {
	public static void main(String[] argos) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60); //weightの60を引数にいれる
		person1.print();
		
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();
		
		//クラスメソッドを呼び出して人数を出力
		Person.printCount();
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		//問題4 setOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者クラスを「person2」に設定、personクラスのインスタンスからフルネームを取得してownerに設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		//問題5 オーナーをコンソールに出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		//問題10 buyメソッドを用いて、「person1」が車を購入、「person2」が自転車を購入するプログラムを作成
		person1.buy(car);
		person2.buy(bicycle);
	}

}
