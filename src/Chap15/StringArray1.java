package Chap15;

// 文字列の配列

class StringArray1 {

	public static void main(String[] args) {
		String[] sx = { "Turbo", "NA", "DOHC" };

		for (int i = 0; i < sx.length; i++)
			System.out.println("sx[" + i + "] = \"" + sx[i] + "\"");
	}
}
