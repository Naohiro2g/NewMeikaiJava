package shape1;

// 図形クラス群【第１版】の利用例

class ShapeTester {

	public static void main(String[] args) {
		// 	以下の宣言はエラー：抽象クラスはインスタンス化できない
		//		Shape s = new Shape();

		Shape[] a = new Shape[2];
		a[0] = new Point(); // 点
		a[1] = new Rectangle(4, 3); // 長方形

		for (Shape s : a) {
			s.draw(); // 描画
			System.out.println();
		}
	}
}
