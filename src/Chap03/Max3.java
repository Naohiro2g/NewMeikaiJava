package Chap03;

// 三つの整数値の最大値を求める

import java.util.Scanner;

class Max3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		System.out.print("整数c：");
		int c = stdIn.nextInt();

		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		System.out.println("最大値は" + max + "です。");
	}
}
