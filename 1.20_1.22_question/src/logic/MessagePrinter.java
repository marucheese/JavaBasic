package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessagePrinter {
	private String greeting;
	private String foodComment;
	private String foodType;
	private String currentDateTime;
	
	public MessagePrinter() {
		this.greeting = "こんにちは！ここは日本です！";
		this.foodComment = "この寿司はうまい";
		this.foodType = "寿司は和食です";
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.currentDateTime = "今の現在日時は" + now.format(formatter) + "です。";
	}
	
	public void printMessages() {
		System.out.println(this.greeting);
		System.out.println(this.foodComment);
		System.out.println(this.foodType);
		System.out.println(this.currentDateTime);
	}

}
