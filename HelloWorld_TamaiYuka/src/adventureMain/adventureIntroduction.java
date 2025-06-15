package adventureMain; //メインpackage

import java.util.Scanner;

import adventureCharacter.adventurePlayer;

public class adventureIntroduction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください");
		String name = scanner.nextLine();
		
		adventurePlayer user = new adventurePlayer(name);
		user.showStatus();
		scanner.close();
	}
}
