package jp_prefecture_main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import jp_prefecture_info.jpPrefecture;

public class prefectureMain {
	public static void main(String[] args) {
		//List<データ型名>オブジェクト名=new ArrayList<データ型名>();
		List<jpPrefecture> prefectures = Arrays.asList(
				new jpPrefecture(0, "北海道", "札幌市", 83424),
				new jpPrefecture(1, "青森県", "青森市", 9646),
				new jpPrefecture(2, "岩手県", "盛岡市", 15275),
				new jpPrefecture(3, "宮城県", "仙台市", 7282),
				new jpPrefecture(4, "秋田県", "秋田市", 11638),
				new jpPrefecture(5, "山形県", "山形市", 9323),
				new jpPrefecture(6, "福島県", "福島市", 13784),
				new jpPrefecture(7, "茨城県", "水戸市", 6097),
				new jpPrefecture(8, "栃木県", "宇都宮市", 6408),
				new jpPrefecture(9, "群馬県", "前橋市", 6362),
				new jpPrefecture(10, "埼玉県", "さいたま市", 3798)
	);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("番号(カンマ区切り)と昇順・降順を入力してください");
		String input = scanner.nextLine().trim(); //trim()で空白削除
		
		//入力値の形式が正しくなければ「入力形式が正しくありません」と出力
		if (!input.matches(".*\\d+.*\\s+(昇順|降順)")) {
			System.out.println("入力形式が正しくありません");
			return;
		}
		
		String[] parts = input.split("\\s+"); //空白文字で区切る
		String[] ids = parts[0].split(","); //空白より前の部分は「,」で区切る
		String order = parts[1]; //空白より後ろは順番を表す
		
		//ArrayListをインスタンス化
		List<jpPrefecture> selected = new ArrayList<>();
		
		for (String idStr : ids) {
			try {
				int id = Integer.parseInt(idStr.trim()); //文字列を整数に変換
					if (id >= 0 && id < prefectures.size()) { //idが0以上かつ要素数より小さい時
						selected.add(prefectures.get(id)); //selectedに追加
					} else {
						System.out.println("無効な番号: " + id);
					}
			} catch (NumberFormatException e) { //例外が起きた時
				System.out.println("無効な入力: " + idStr); //例外発生時の処理
			}
		}
		
		//昇順に並べる
		if (order.equals("昇順")) { //昇順と入力されたら
			selected.sort(Comparator.comparingInt(jpPrefecture::getId));
		} else if (order.equals("降順")) { //降順と入力されたら
			selected.sort(Comparator.comparingInt(jpPrefecture::getId).reversed());
		}
		
		//結果の出力
		for (jpPrefecture p : selected) {
			System.out.println(p);
		}
		
	}

}
