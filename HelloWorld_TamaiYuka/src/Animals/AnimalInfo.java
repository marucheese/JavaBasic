package Animals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalInfo {
	
	//学名のマップを初期化
	private static final Map < String, String> SCIENTIFIC_NAMES = new HashMap<>(); //Map<キーの型名, 値の型名> オブジェクト名 = new HashMap<>();
	static {
		SCIENTIFIC_NAMES.put("ライオン", "パンテラ　レオ");
		SCIENTIFIC_NAMES.put("ゾウ", "ロキソドンタ・サイクロティス");
		SCIENTIFIC_NAMES.put("パンダ", "アイルロポダ・メラノレウカ");
		SCIENTIFIC_NAMES.put("チンパンジー", "パン・トゥログロディテス");
		SCIENTIFIC_NAMES.put("シマウマ", "チャップマンシマウマ");
		//インコは学名不明のため記述なし
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("コンソールに文字を入力してください"); //「コンソールに文字を入力してください」と出力
		
		String input = scanner.nextLine(); //入力内容を読み込む
		String[] animals = input.split(","); //入力内容を「,」で分割
		
		for(String animalData : animals) { //拡張for文 for(型 変数名 : 配列名もしくはコレクション名)
			String[] parts = animalData.split(":"); //「,」で分割した入力内容をさらにそれぞれ「:」で分割
			if(parts.length != 3) continue; //「:」で区切られた要素が3つでなければ以降の処理はスキップ
			
			String name = parts[0];
			String length = parts[1];
			String speed = parts[2];
			String scientificName = SCIENTIFIC_NAMES.getOrDefault(name, "不明"); //HashMap内に入力されたキーが存在しない場合デフォルト値「不明」を返す　getOrDefault(key, defaultValue)
			
			//結果を出力する
			System.out.println();
			System.out.println("動物名：" + name);
			System.out.println("体長：" + length + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientificName);
		}
		scanner.close();
	}
}
