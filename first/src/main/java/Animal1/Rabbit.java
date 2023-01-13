package Animal1;

import org.springframework.stereotype.Component;

@Component("rabbit")
public class Rabbit implements Animal {

	public String lnc = "당근";

	@Override
	public String lunch() {
		return lnc;
	}

}
