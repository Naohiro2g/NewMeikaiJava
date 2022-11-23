package player;

// クラスPortablePlayerの利用例

class PortablePlayerTester {

	public static void main(String[] args) {
		PortablePlayer a = new PortablePlayer();
		System.out.println("現在のスキンは、" + a.getSkin() + "です。");
		a.play(); // 再生
		a.stop(); // 停止
		a.changeSkin(Skinnable.LEOPARD); // スキンを豹柄に変更
	}
}
