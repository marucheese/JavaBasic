package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 21; j++) {
				System.out.printf("%03d%s%03d%s%03d%s", j, "*", i, "=", j*i, "||");
			}
			System.out.println();
		}
	}

}
