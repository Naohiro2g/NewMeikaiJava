package Chap16;

// 前回の気分を表示（資源付きtry文）
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class LastTime2 {

	//--- 前回の気分を読み込む---//
	static void init() {
		try (
				BufferedReader br = new BufferedReader(new FileReader("LastTime.txt"));) {
			String kibun = br.readLine();
			System.out.println("前回の気分は" + kibun + "でした。");
		} catch (IOException e) {
			System.out.println("このプログラムを実行するのは初めてですね。");
		}
	}

	//--- 今回の気分を読み込む---//
	static void term(String kibun) {
		try (
				FileWriter fw = new FileWriter("LastTime.txt");) {
			fw.write(kibun);
		} catch (IOException e) {
			System.out.println("エラー発生!!");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);

		init(); // 前回の気分を表示

		System.out.print("今の気分は：");
		String kibun = stdIn.next();

		term(kibun);
	}
}
