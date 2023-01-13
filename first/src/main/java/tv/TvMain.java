package tv;

public class TvMain {

	public static void main(String[] args) {
		TvFactory fac = new TvFactory();
		TV tv = fac.getTV(args[0]);
		tv.powerOn();
		tv.soundUp(5);
		tv.soundDown(3);
		tv.powerOff();
	}

}
