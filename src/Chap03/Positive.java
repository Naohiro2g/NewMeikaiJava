package Chap03;

// 読み込んだ整数値は正の値か？

import java.util.Scanner;

class Positive {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("その値は正です。");
	}
}
