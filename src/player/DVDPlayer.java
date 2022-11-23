package player;

//===== ＤＶＤプレーヤ =====//
class DVDPlayer implements ExPlayer {

	public void play() { // ○再生 
		System.out.println("■ＤＶＤ再生開始！");
	}

	public void stop() { // ○停止
		System.out.println("■ＤＶＤ再生終了！");
	}

	public void slow() { // ●スロー再生
		System.out.println("■ＤＶＤスロー再生開始！");
	}
}
