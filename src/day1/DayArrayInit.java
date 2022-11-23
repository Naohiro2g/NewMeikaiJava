package day1;

// 日付クラスDay【第１版】の配列（その３：初期化）

class DayArrayInit {

	public static void main(String[] args) {
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };

		// 明治・大正・昭和・平成の初日
		Day[] x = { new Day(1868, 9, 8), // 明治
				new Day(1912, 7, 30), // 大正
				new Day(1926, 12, 25), // 昭和
				new Day(1989, 1, 8), // 平成
		};

		for (int i = 0; i < x.length; i++)
			System.out.println("x[" + i + "] = "
					+ x[i].getYear() + "年"
					+ x[i].getMonth() + "月"
					+ x[i].getDate() + "日("
					+ wd[x[i].dayOfWeek()] + ")");
	}
}
