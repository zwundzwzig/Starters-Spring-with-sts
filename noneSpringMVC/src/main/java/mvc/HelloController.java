package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse res) {
		// model 설정
		HelloDTO dto = new HelloDTO();
		dto.setMessage("model controller gives view");
		req.setAttribute("model", dto);
		
		// view 설정
		return "hello.jsp";
	}

}
