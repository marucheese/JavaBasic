package adventureCharacter; //処理用package

import java.util.Random;
//サブクラス
public class adventurePlayer extends Character {
	
	public adventurePlayer(String name) {
		super(name);
		generateStatus();
	}
	//ステータスの数値をランダムに生成する
	private void generateStatus() {
		Random random = new Random();
		setHp(random.nextInt(1001)); //0〜1000でランダム
		setMp(random.nextInt(1001)); //0〜1000でランダム
		setAttack(random.nextInt(1001)); //0〜1000でランダム
		setSpeed(random.nextInt(1001)); //0〜1000でランダム
		setDefense(random.nextInt(101)); //0〜100で
	}
	
	//ステータスを表示するメソッド
	public void showStatus() {
		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + getHp());
		System.out.println("MP：" + getMp());
		System.out.println("攻撃力：" + getAttack());
		System.out.println("素早さ：" + getSpeed());
		System.out.println("防御力：" + getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}

}
