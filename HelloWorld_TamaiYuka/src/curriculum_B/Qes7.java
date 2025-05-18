package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		String[] subjects = {"英語", "数学", "理科", "社会"}; //点数入力を求める教科
		Scanner num = new Scanner(System.in);
		System.out.println("生徒の人数を入力してください(2以上):"); //生徒の人数を入力してくださいと表示
		int studentNum = num.nextInt();
		int[][] scores = new int[studentNum][subjects.length];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println();
			for(int j = 0; j < scores[i].length; j++) {
				Scanner score = new Scanner(System.in);
				System.out.println((i+1) + "人目の生徒の" + subjects[j] + "の点数を入力してください:"); //N人目の生徒の各教科の点数を入力してくださいと表示
				int subScore = score.nextInt();
				scores[i][j] = subScore;
			}
		}
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) { //生徒ごとの平均点を計算
			int sum = 0;
			for(int j = 0; j< scores[i].length; j++) {
				sum +=scores[i][j]; //各生徒の合計点数
			}
			double studentAvg = (double)sum/subjects.length; //生徒ごとの平均点
			System.out.println((i+1) + "人目の平均点は" + String.format("%.2f", studentAvg) + "点です。"); //生徒ごとの平均点を表示
		}
		System.out.println();
		
		double wholeScore = 0.0; //全体の合計点
		for(int i = 0; i < subjects.length; i++) { //科目ごとの平均点を計算
			int sum = 0;
			for (int j = 0; j < scores.length; j++) {
				sum +=scores[j][i]; //各科目の合計点数
			}
			double subjectAvg = (double)sum/studentNum; //科目ごとの平均点
			System.out.println(subjects[i] + "の平均点は" + String.format("%.2f", subjectAvg) + "点です。"); //科目ごとの平均点を表示
			wholeScore += subjectAvg; //全体の合計点を求める
		}
			double wholeAvg = wholeScore/4; //全体の平均点
			System.out.println("全体の平均点は" + String.format("%.2f", wholeAvg) + "点です。");
		}
		
	
}