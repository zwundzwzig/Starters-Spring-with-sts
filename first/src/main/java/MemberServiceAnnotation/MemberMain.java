package MemberServiceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import MemberServiceAnnotation.MemberDAO;

public class MemberMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("MemberServiceAnnotation/member.xml");
		
		MemberService service = factory.getBean("service", MemberJanService.class);
		service.registerMember();
		
	}

}
