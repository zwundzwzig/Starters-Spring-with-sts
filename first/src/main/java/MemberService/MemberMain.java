package MemberService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("MemberService/member.xml");
		MemberService service = factory.getBean("service", MemberBasicService.class);
		service.registerMember();
		
		System.out.println("============================");
		String[] beanNames = factory.getBeanDefinitionNames();
		for(String beanName : beanNames) { System.out.println(beanName); }
	}

}
