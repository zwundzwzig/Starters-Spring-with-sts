package spring.list;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ListDTO dto = new ListDTO();
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");
		list.add("choi");
		list.add("jung");
		dto.setList(list);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", dto);
		mv.setViewName("list");
		return mv;
	}

}
