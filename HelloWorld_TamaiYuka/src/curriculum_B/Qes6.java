package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //入力処理
		String[] products = scanner.nextLine().split("、"); //文字列の入力の受け取り
		Random rand = new Random();
		int stock = rand.nextInt(12); //残り台数を0〜11まででランダムに求める
		int tvStock = 11-stock; //テレビの残り台数
		int vdtStock = 11-tvStock; //ディスプレイの残り台数
		
		for (String product: products) {
			int itemStock = rand.nextInt(12); //パソコン、冷蔵庫、扇風機、洗濯機、加湿器の残り台数をランダムに求める
			String cap = product + "の残り台数は" + itemStock + "台です"; 
			
		switch(product) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				break;
			case "テレビ","ディスプレイ":
				cap = "テレビ".equals(product) ? product + "の残り台数は" + tvStock + "台です": product + "の残り台数は" + (11 - tvStock) + "台です"; //productがテレビと一致すれば残り台数はtvStock、そうでなければ(11-tvStock)台
				cap ="ディスプレイ".equals(product) ? product + "の残り台数は" + vdtStock + "台です": product + "の残り台数は" + (11 - vdtStock) + "台です"; //productがディスプレイと一致すれば残り台数はvdtStock、そうでなければ(11-vdtStock)台
				break;
			default:
				cap ="『" + product + "』は指定の商品ではありません";
				break;
		}
		System.out.println(cap);
		}		

	}
}