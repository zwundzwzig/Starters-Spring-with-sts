package tv;

public class TvFactory {

	public TV getTV(String name) {
		if(name.equals("samsung")) return new SamsungTv();
		return null;
	}

}
