package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte a; //バイト型をローカル変数aとして宣言
		short b; //短整数型をローカル変数bとして宣言
		int c; //整数型をローカル変数cとして宣言
		long d; //長整数型をローカル変数dとして宣言
		float e; //単精度浮動小数点数型をローカル変数eとして宣言
		double f; //倍精度浮動小数点数型をローカル変数fとして宣言
		char g; //文字型をローカル変数gとして宣言
		String h; //文字列型をローカル変数hとして宣言
		boolean i; //ブーリアン型をローカル変数iとして宣言
		
		{
		 a = -128; //ローカル変数aを初期値-128を代入して初期化
		 b = -32768; //ローカル変数bを初期値-32768を代入して初期化
		 c = 0; //ローカル変数cを初期値0を代入して初期化
		 d = 9; //ローカル変数dを初期値9を代入して初期化
		 e = 3.14f; //ローカル変数eを初期値3.14fを代入して初期化
		 f = 2.718; //ローカル変数fを初期値2.718を代入して初期化
		 g = 'あ'; //ローカル変数gを初期値あを代入して初期化
		 h = "あいう"; //ローカル変数hを初期値あいうを代入して初期化
		 i = false; //ローカル変数iを初期値falseを代入して初期化
		}
		
		{
			a = 10; //バイト型の変数aに10を代入
			b = 100; //短整数型の変数bに100を代入
			c = 1000; //整数型の変数cに1000を代入
			d = 10000; //長整数型の変数dに10000を代入
			e = 9.5f; //単精度浮動小数点数の変数eに9.5を代入
			f = 10.5; //倍精度浮動小数点数の変数fに10.5を代入
			g = 'a'; //文字型の変数gにaを代入
			h = "ハロー"; //文字列型の変数hにハローを代入
			i = true; //ブーリアン型の変数iにtrueを代入
			
			System.out.println(a + b + c + d); //11110と出力
			System.out.println(e + f); //20と出力
			System.out.println(g + h + i); //aハローtrueと出力
			System.out.println(a + b+ c + d + e + f); //11130と出力
			System.out.println(a * b * c * d); //10000000000と出力
			System.out.println(f / b); //0.105と出力
			System.out.println(a - b); //-90と出力
		}
		
		{
			String num = "20"; // 文字列型numに20を代入して初期化
			int num1 = 23; // 整数型num1に23を代入して初期化
			String num2 = String.valueOf(num1); // num1を文字列型に変換
			System.out.println("ハローJAVA" + num + num2); // ハローJAVA2023と出力
		}
		
		{
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
		}
			
		{	
			String name = "鈴木一郎"; // nameに鈴木一郎を代入
			int age = 24; // ageに24を代入
			double height = 168.5; // heightに168.5を代入
			double weight = 64.2; // weightに64.2を代入
			String food = "オムライス"; // foodにオムライスを代入
			
			System.out.println("はじめまして" + name + "です"); // はじめまして鈴木一郎ですと出力
			System.out.println("年齢は" + age + "歳です"); // 年齢は24歳ですと出力
			System.out.println("身長は" + height + "cmです"); // 身長は168.5cmですと出力
			System.out.println("体重は" + weight + "kgです"); // 体重は64.2kgですと出力
			System.out.println("好きな食べ物は" + food + "です"); // 好きな食べ物はオムライスですと出力
			System.out.println("BMIは" + weight / (height / 100 * height / 100) +"です"); // BMIは22.6ですと出力
			
			age = age + age; // 年齢を和算で自己代入
			height = height + height; // 身長を和算で自己代入 
			weight = weight + weight; // 体重を和算で自己代入
			
			System.out.println("はじめまして" + name + "です"); // はじめまして鈴木一郎ですと出力
			System.out.println("年齢は" + age + "です"); // 年齢は48歳ですと出力
			System.out.println("身長は" + height +"です"); // 身長は337.0cmですと出力
			System.out.println("体重は" + weight + "です"); // 体重は128.4kgですと出力
			System.out.println("好きな食べ物は" + food + "です"); // 好きな食べ物はオムライスですと出力
			System.out.println("BMIは" + weight / (height / 100 * height / 100) +"です"); // BMIは11.31ですと出力
		}
		
		{
			int age = 24; // 8で使用した年齢をageに代入
			double height = 168.5; // 8で使用した身長をheightに代入
			double weight = 64.2; // 8で使用した体重をweightに代入
			System.out.println(age >= 25); // 25歳以上ならtrueを出力
			
			String age1 = String.valueOf(age); //年齢を文字列型に変換
			String height1 = String.valueOf(height); //身長を文字列型に変換
			String weight1 = String.valueOf(weight); //体重を文字列に変換
			System.out.println(age1 + height1 + weight1); //年齢、身長、体重を繋げて出力
			
			int age2 = Integer.parseInt(age1); //年齢を整数型に変換
			double height2 = Double.parseDouble(height1); //身長を整数型に変換
			System.out.println(age2); //年齢を出力
			System.out.println(height2); //身長を出力
			System.out.println(age2 >= 25 || height2 >= 160); // 年齢が25歳以上、または身長が160以上であればtrueを出力
		}
	}

}
