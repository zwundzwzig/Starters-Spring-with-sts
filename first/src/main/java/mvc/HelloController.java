package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		HelloDTO dto = new HelloDTO();
		dto.setMessage("model controller gives view");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", dto);
		mv.setViewName("hello");
		return mv;
	}

}
