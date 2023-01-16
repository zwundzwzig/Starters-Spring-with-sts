package mvcAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	@Qualifier("service2")
	MemberService service; //MemberBasicService 객체
	
	@GetMapping("/register")
	String insertMember(){
		return "/register";//member/register.jsp(7개 데이터폼)
	}
	
	@PostMapping("/register")
	ModelAndView insertMember2(@ModelAttribute("dto") MemberDTO dto) {
		String result = service.registerMember(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		//mv.addObject("dto", dto);
		mv.setViewName("/registersuccess");
		return mv;
	}

}
