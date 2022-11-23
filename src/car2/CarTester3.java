package car2;

// 自動車クラス【第２版】の利用例（その３）

// stdInでリソースリークの警告が出る。stdInをcloseすると困るので、
// 警告を出さないようにしてみたが、今度はコードが自由に書けないようになった。？？
// 半角文字１個？追加するごとに、OK/NGが繰り返される、なぞ状態。    
// コメント領域だけでなく、有効なコード領域でも同じ。 
// 「型java.lang.Stringを解決できません。必要な.classファイルから間接的に参照されています。」


import java.util.Scanner;

class CarTester3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");
		System.out.print("名前は：");			String name = stdIn.next();
		System.out.print("車幅は：");			int width = stdIn.nextInt();
		System.out.print("高さは：");			int height = stdIn.nextInt();
		System.out.print("長さは：");			int length = stdIn.nextInt();
		System.out.print("ガソリン量は：");		double fuel = stdIn.nextDouble();
		System.out.print("購入年：");			int y = stdIn.nextInt();
		System.out.print("購入月：");			int m = stdIn.nextInt();
		System.out.print("購入日：");			int d = stdIn.nextInt();

		Car car2 = new Car(name, width, height, length, fuel, new Day(y, m, d));

		car2.putSpec();
		System.out.println("購入日：" + car2.getPurchaseDay());
	}
}
