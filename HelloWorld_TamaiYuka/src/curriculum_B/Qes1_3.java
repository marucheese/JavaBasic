package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //入力処理
	System.out.print("名前"); //名前と出力
	String name = scanner.next(); //文字列の入力の受け取り
	System.out.println(name); //nameを出力
	
	while(true) {
		if(name == null || name.length() == 0) { //「ユーザー名の文字数が0文字以下もしくはnullの場合」という条件
			System.out.println("名前を入力してください"); //「名前を入力してください」と出力する処理
		} else if(name.length() > 10) { //「ユーザー名の文字数が10文字より大きい場合」という条件
			System.out.println("名前を10文字以内にしてください"); //「名前を10文字以内にしてください」と出力する処理
		} else if(!name.matches("^[A-Za-z0-9]+$")) { //「ユーザー名が半角英数字以外の場合」という条件
			System.out.println("半角英数字のみで名前を入力してください"); //「半角英数字のみで名前を入力してください」と出力する処理
		} else {
			System.out.println("ユーザー名「" + name + "」を登録しました"); //「ユーザー名「入力したユーザー名」を登録しました」と出力する処理
			int winCount = 0; //勝った数を数える
			int loseCount = 0; //負けた数を数える
			int drawCount = 0; //あいこの数を数える
			Scanner stdin = new Scanner(System.in);
			
			while (winCount < 1) { //1回勝つまで繰り返す
			
				int user = stdin.nextInt();
				Random rand = new Random();
				int pcu = rand.nextInt(3); //PCの手を0,1,2からランダムで求める
			
				String result="";
				if((user==0 && pcu==1 || (user==1 && pcu==2 || (user==2 && pcu==0)))) { //じゃんけんに勝ったら
					winCount++; //勝った数に1追加
					result = "やるやん。次は俺にリベンジさせて\n勝つまでにかかった合計回数は" + (winCount+loseCount+drawCount) + "回です"; //「やるやん。次は俺にリベンジさせて」と勝つまでにかかった回数を出力
				}else if(user==1 && pcu==0) { //自分がじゃんけんでグーに負けた場合
					loseCount++; //負けた数に1追加
					result ="俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ"; //「俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ」と出力
				}else if(user==2 && pcu==1) { //自分がじゃんけんでチョキに負けた場合
					loseCount++; //負けた数に1追加
					result ="俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ";
				}else if(user==0 && pcu==2) { //自分がじゃんけんでパーに負けた場合
					loseCount++; //負けた数に1追加
					result ="俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです"; //「俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです」と出力
				}else { //あいこの場合
					drawCount++; //あいこの数に1追加
					result ="DRAW あいこ もう一回しましょう！"; //「DRAW あいこ もう一回しましょう！」と出力
			}
			String[] hands = { "グー", "チョキ", "パー" }; 
			System.out.println(name + "の手は「" + hands[user] + "」"); //自分の手を表示
			System.out.println("相手の手は「" + hands[pcu] +"」"); //相手の手を表示
			System.out.println(result); //結果を表示
		}
		stdin.close();
		}
			break;
		}
	}
}	