package jp_prefecture_info;

public class jpPrefecture {
	//id,name,capital,areaのフィールドを定義
	private int id;
	private String name;
	private String capital;
	private double area;
	
	//コンストラクタ
	public jpPrefecture(int id, String name, String capital, double area) {
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	//getterを使用
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCapital() {
		return capital;
	}
	public double getArea() {
		return area;
	}
	
	//オーバーライドすることを宣言
	@Override
	public String toString() {
		return String.format("都道府県名 : %s\n県庁所在地 : %s\n面積 : %.1f㎢\n", name, capital, area);
	}

}
