package day1;

// 日付クラスDay【第１版】利用例（その１：日付を表示）

import java.util.Scanner;

class DayTester {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };

		System.out.println("誕生日を西暦で入力せよ。");
		System.out.print("年：");
		int y = stdIn.nextInt();
		System.out.print("月：");
		int m = stdIn.nextInt();
		System.out.print("日：");
		int d = stdIn.nextInt();

		Day birthday = new Day(y, m, d);

		System.out.println("あなたの誕生日"
				+ birthday.getYear() + "年"
				+ birthday.getMonth() + "月"
				+ birthday.getDate() + "日は"
				+ wd[birthday.dayOfWeek()] + "曜日です。");
	}
}
