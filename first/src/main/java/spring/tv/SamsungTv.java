package spring.tv;

public class SamsungTv implements TV {

	public void powerOn() {
		System.out.println("let's go samsung");
	}
	public void soundUp(int v) {
		System.out.println(++v);
	}
	public void soundDown(int v) {
		System.out.println(++v);
	}
	public void powerOff() {
		System.out.println("bye samsung");
	}

}
