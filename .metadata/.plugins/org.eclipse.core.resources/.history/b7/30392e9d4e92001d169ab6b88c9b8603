package mvc;

import java.util.HashMap;

public class HandlerMapping {
	HashMap<String, Controller> mappings;
	
	HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("hello", new HelloController());
//		mappings.put("list", new ListController());
	}
	
	Controller getController(String url) {
		System.out.println("handler mapping now");
		return mappings.get(url);
	}
}
