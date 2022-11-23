package Chap11;

// 識別番号クラスRandIdの利用例

import Chap11.id.RandId;

public class RandIdTester {

	public static void main(String[] args) {
		RandId a = new RandId();
		RandId b = new RandId();
		RandId c = new RandId();

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
	}
}
