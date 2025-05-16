package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //入力処理
		String[] products = scanner.nextLine().split("、"); //文字列の入力の受け取り
		
		for (String product: products) {
			Random rand = new Random();
			int stock = rand.nextInt(12); //残り台数を0〜11まででランダムに求める
			int tvStock = 11-stock;
			int vdtStock = 11-tvStock;
			String cap = product + "の残り台数は" + stock + "台です";
			
		switch(product) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				break;
			case "テレビ","ディスプレイ":
				cap = "テレビ".equals(product) ? product + "の残り台数は" + tvStock + "台です": product + "の残り台数は" + (11 - tvStock) + "台です";
				cap ="ディスプレイ".equals(product) ? product + "の残り台数は" + vdtStock + "台です": product + "の残り台数は" + (11 - vdtStock) + "台です";
				break;
			default:
				cap ="『" + product + "』は指定の商品ではありません";
				break;
		}
		System.out.println(cap);
		}		

	}
}