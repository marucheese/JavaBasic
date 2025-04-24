package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte b; //バイト型をローカル変数bとして宣言
		short sh; //短整数型をローカル変数shとして宣言
		int num; //整数型をローカル変数numとして宣言
		long lon; //長整数型をローカル変数lonとして宣言
		float f; //単精度浮動小数点数型をローカル変数fとして宣言
		double d; //倍精度浮動小数点数型をローカル変数dとして宣言
		char c; //文字型をローカル変数cとして宣言
		String str; //文字列型をローカル変数strとして宣言
		boolean boo; //ブーリアン型をローカル変数booとして宣言
		
		
		 b = 0; //ローカル変数bを初期値0を代入して初期化
		 sh = 0; //ローカル変数shを初期値0を代入して初期化
		 num = 0; //ローカル変数numを初期値0を代入して初期化
		 lon = 0L; //ローカル変数lonを初期値0Lを代入して初期化
		 f = 0.0f; //ローカル変数fを初期値0.0fを代入して初期化
		 d = 0.0d; //ローカル変数dを初期値0.0dを代入して初期化
		 c = '\u0000'; //ローカル変数cを初期値\u0000を代入して初期化
		 str = null; //ローカル変数strを初期値nullを代入して初期化
		 boo = false; //ローカル変数booを初期値falseを代入して初期化
		
		
		
			b = 10; //バイト型の変数bに10を代入
			sh = 100; //短整数型の変数shに100を代入
			num = 1000; //整数型の変数numに1000を代入
			lon = 10000; //長整数型の変数lonに10000を代入
			f = 9.5f; //単精度浮動小数点数の変数fに9.5を代入
			d = 10.5; //倍精度浮動小数点数の変数dに10.5を代入
			c = 'a'; //文字型の変数cにaを代入
			str = "ハロー"; //文字列型の変数strにハローを代入
			boo = true; //ブーリアン型の変数booにtrueを代入
			
			System.out.println(b + sh + num + lon); //11110と出力
			System.out.println(f + d); //20と出力
			System.out.println(c + str + boo); //aハローtrueと出力
			System.out.println(b + sh + num + lon + f + d); //11130と出力
			System.out.println(b * sh * num * lon); //10000000000と出力
			System.out.println(d / sh); //0.105と出力
			System.out.println(b - sh); //-90と出力
		
		
		
			String num0 = "20"; // 文字列型numに20を代入して初期化
			int num1 = 23; // 整数型num1に23を代入して初期化
			String num2 = String.valueOf(num1); // num1を文字列型に変換
			System.out.println("ハローJAVA" + num0 + num2); // ハローJAVA2023と出力
		
		
		
			String name = "山田太郎"; // 文字列型nameに山田太郎を代入して初期化
			int age = 18; // 整数型ageに18を代入して初期化
			double height = 170.5; // 倍精度浮動小数点数型heightに170.5を代入して初期化
			double weight = 62.2; // 倍精度浮動小数点数型weightに62.2を代入して初期化
			String food = "寿司"; // 文字列型foodに寿司を代入して初期化
			
			System.out.println("はじめまして" + name + "です"); // はじめまして山田太郎ですと出力
			System.out.println("年齢は" + age + "歳です"); // 年齢は18歳ですと出力
			System.out.println("身長は" + height + "cmです"); // 身長は170.5cmですと出力
			System.out.println("体重は" + weight + "kgです"); // 体重は62.2kgですと出力
			System.out.println("好きな食べ物は" + food + "です"); // 好きな食べ物は寿司ですと出力
			System.out.println("BMIは" + weight / (height / 100 * height / 100) +"です"); // BMIは21.3ですと出力
		
			
		
			String name1 = "鈴木一郎"; // nameに鈴木一郎を代入
			int age1 = 24; // ageに24を代入
			double height1 = 168.5; // heightに168.5を代入
			double weight1 = 64.2; // weightに64.2を代入
			String food1 = "オムライス"; // foodにオムライスを代入
			
			System.out.println("はじめまして" + name1 + "です"); // はじめまして鈴木一郎ですと出力
			System.out.println("年齢は" + age1 + "歳です"); // 年齢は24歳ですと出力
			System.out.println("身長は" + height1 + "cmです"); // 身長は168.5cmですと出力
			System.out.println("体重は" + weight1 + "kgです"); // 体重は64.2kgですと出力
			System.out.println("好きな食べ物は" + food1 + "です"); // 好きな食べ物はオムライスですと出力
			System.out.println("BMIは" + weight1 / (height1 / 100 * height1 / 100) +"です"); // BMIは22.6ですと出力
			
			age = age1 + age1; // 年齢を和算で自己代入
			height = height1 + height1; // 身長を和算で自己代入 
			weight = weight1 + weight1; // 体重を和算で自己代入
			
			System.out.println("はじめまして" + name1 + "です"); // はじめまして鈴木一郎ですと出力
			System.out.println("年齢は" + age + "歳です"); // 年齢は48歳ですと出力
			System.out.println("身長は" + height +"cmです"); // 身長は337.0cmですと出力
			System.out.println("体重は" + weight + "kgです"); // 体重は128.4kgですと出力
			System.out.println("好きな食べ物は" + food1 + "です"); // 好きな食べ物はオムライスですと出力
			System.out.println("BMIは" + weight / (height / 100 * height / 100) +"です"); // BMIは11.31ですと出力
		
			int age2 = 24; // 8で使用した年齢をageに代入
			double height2 = 168.5; // 8で使用した身長をheightに代入
			double weight2 = 64.2; // 8で使用した体重をweightに代入
			System.out.println(age2 >= 25); // 25歳以上ならtrueを出力
			
			String age3 = String.valueOf(age2); //年齢を文字列型に変換
			String height3 = String.valueOf(height2); //身長を文字列型に変換
			String weight3 = String.valueOf(weight2); //体重を文字列に変換
			System.out.println(age3 + height3 + weight3); //年齢、身長、体重を繋げて出力
			
			int age4 = Integer.parseInt(age3); //年齢を整数型に変換
			double height4 = Double.parseDouble(height3); //身長を整数型に変換
			System.out.println(age4); //年齢を出力
			System.out.println(height4); //身長を出力
			System.out.println(age4 >= 25 || height4 >= 160); // 年齢が25歳以上、または身長が160以上であればtrueを出力
		
	}

}