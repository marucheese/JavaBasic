package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%02d%s%02d%s%02d%s", i, "*", j, "=", i*j, "||"); //2桁表示でク九九とその答えを表示
			}
			System.out.println();
		}
	}

}
