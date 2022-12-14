package car1;

// 自動車クラス【第１版】の利用例（その２：対話的に自動車を移動）
//


import java.util.Scanner;

class CarTester2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");
		System.out.print("名前は：");			String name = stdIn.next();
		System.out.print("車幅は：");			int width = stdIn.nextInt();
		System.out.print("高さは：");			int height = stdIn.nextInt();
		System.out.print("長さは：");			int length = stdIn.nextInt();
		System.out.print("ガソリン量は：");	double fuel = stdIn.nextDouble();

		Car myCar = new Car(name, width, length, height, fuel);

		while (true) {
			System.out.println("現在地(" + myCar.getX() + ", " + myCar.getY() +
									 ")・残り燃料 " + myCar.getFuel());
			System.out.print("移動しますか[0…No／1…Yes]：");
			if (stdIn.nextInt() == 0) break;

			System.out.print("Ｘ方向の移動距離：");
			double dx = stdIn.nextDouble();
			System.out.print("Ｙ方向の移動距離：");
			double dy = stdIn.nextDouble();

			if (!myCar.move(dx, dy))
				System.out.println("燃料が足りません！");
		}
	}
}
