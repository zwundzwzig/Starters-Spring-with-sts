package Animal1;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal {
	
	public String lnc = "생선";

	@Override
	public String lunch() {
		return lnc;
	}

}
