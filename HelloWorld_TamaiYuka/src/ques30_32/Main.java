package ques30_32;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60); //問題５ weightの60を引数にいれる
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		person1.print();
		System.out.println("合計" + Person.getCount() + "人です");
	}

}
