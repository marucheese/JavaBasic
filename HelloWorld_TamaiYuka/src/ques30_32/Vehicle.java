package ques30_32;

public class Vehicle { //問題1 Vehicleクラスを作成し、
	private String owner; //問題1 文字列型のプライベートなインスタンスフィールド「owner」を定義
	
	public String getOwner() { //問題3 Vehicleクラスのownerフィールドのゲッター「getOwner」を定義
		return owner;
	}

	public void setOwner(String owner) { //問題3 Vehicleクラスのownerフィールドのセッター「setOwner」を定義
		this.owner = owner;
	}

public static class Car extends Vehicle{ //問題2 車クラスを作成
	
}

public static class Bicycle extends Vehicle{ //問題2 自転車クラスを作成
	
}	
}
