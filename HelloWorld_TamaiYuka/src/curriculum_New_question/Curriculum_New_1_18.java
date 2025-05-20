package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	private static Random random = new Random();
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	static void greet(String name, int num) {
		System.out.println("Hello" + name + num);
	}
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	static void mul(int a, int b) {
		System.out.println(a*b);
	}
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	static void displayArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	static void mul(double a, double b) {
		System.out.println(a+b);
	}
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
	static int[] createArray(int length) {
		int[] array = new int[length];
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(99) + 1;
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
	static double average(int[] array) {
		double avg = Arrays.stream(array).average().getAsDouble();
		System.out.println(avg);
		return avg;
	}
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	static boolean judgement(double avg) {
		boolean judgement = avg > 50;
		System.out.println(judgement);
		return judgement;
	}
		public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
		// Q1で作成したメソッドを呼び出す
			greet("JAVASE", 11);
		// Q2で作成したメソッドを呼び出す
			mul(2,3);
		// Q3で作成したメソッドを呼び出す
			int[] a = {1, 2, 3, 4, 5};
			displayArray(a);
		// Q4で作成したメソッドを呼び出す
			mul(4.0,5.0);
		// Q5,Q6,Q7で作成したメソッドを呼び出す
			System.out.println(judgement(average(createArray(3))));
		}

}
