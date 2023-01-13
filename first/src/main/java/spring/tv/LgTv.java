package spring.tv;

public class LgTv implements TV {
	
	LgTv() {
		System.out.println("Lg 생성자 호출");
	}
	
	public void powerOn() {
		System.out.println("let's go lg");
	}
	public void soundUp(int v) {
		System.out.println("" + ++v);
	}
	public void soundDown(int v) {
		System.out.println("" + ++v);
	}
	public void powerOff() {
		System.out.println("bye lg");
	}


}
