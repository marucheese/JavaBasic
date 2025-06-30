package jp_prefecture_main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import jp_prefecture_info.JpPrefecture;

public class PrefectureMain {
	public static void main(String[] args) {
		List<JpPrefecture> prefectures = Arrays.asList(
				new JpPrefecture(0, "北海度", "札幌市", 83424),
				new JpPrefecture(1, "青森県", "青森市",9646),
				new JpPrefecture(2, "岩手県", "盛岡市", 15275),
				new JpPrefecture(3, "宮城県", "仙台市", 7282),
				new JpPrefecture(4, "秋田県", "秋田市", 11638),
				new JpPrefecture(5, "山形県", "山形市", 9323),
				new JpPrefecture(6, "福島県", "福島市", 13784),
				new JpPrefecture(7, "茨城県", "水戸市", 6097),
				new JpPrefecture(8, "栃木県", "宇都宮市", 6408),
				new JpPrefecture(9, "群馬県", "前橋市", 6362),
				new JpPrefecture(10, "埼玉県", "さいたま市", 3798)
				);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("番号(カンマ区切り)と昇順・降順を入力してください");
		String input = scanner.nextLine().trim();
		
		if(!input.matches(".*\\d+.*\\s+(昇順|降順)") ) {
			System.out.println("入力内容が正しくありません");
			return;
		}
		
		String[] parts = input.split("\\s+");
		String[] ids = parts[0].split(",");
		String order = parts[1];
		
		List<JpPrefecture> selected = new ArrayList<>();
		
		for(String idStr : ids) {
			try {
				int id = Integer.parseInt(idStr.trim());
				if(id >= 0 && id < prefectures.size()) {
					selected.add(prefectures.get(id));
				} else {
					System.out.println("無効な番号:" + id);
				} 
			} catch (NumberFormatException e) {
					System.out.println("無効な入力:" + idStr);
				}
			}
			
			if (order.equals("昇順")) {
				selected.sort(Comparator.comparingInt(JpPrefecture::getId));
			} else if (order.equals("降順")) {
				selected.sort(Comparator.comparingInt(JpPrefecture::getId).reversed());
			}
			
			for (JpPrefecture p : selected) {
				System.out.println(p);
			}
				
		}

	}


