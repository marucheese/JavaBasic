package Animal_info;
//課題1.23
public class Animal {
	//name,length,speed	の3つのフィールドを定義
	private String name;
	private double length;
	private int speed;
	
	//コンストラクタ
	public Animal(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}
	
	//それぞれにgetterとsetterを使う
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	                           
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//動物の情報を出力するメソッド
	public void printInfo() {
		System.out.println("動物名：" + this.getName());
		System.out.println("体調：" + this.getLength() + "m");
		System.out.println("速度：" + this.getSpeed() + "km/h");
	}
	
	//メインメソッド
	public static void main(String[] args) {
		Animal lion = new Animal("ライオン", 2.1, 80);
		lion.printInfo();
	}

}
