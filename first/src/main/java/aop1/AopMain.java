package aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop1/aop1.xml");
		
		Member m = factory.getBean("member", Member.class);
		System.out.println("==========================");
		m.insert("spring", 1111);
		System.out.println("==========================");
		m.logIn("spring");
		System.out.println("==========================");
		m.logOut();
		
		Board b = factory.getBean("board", Board.class);
		System.out.println("==========================");
		b.insert(1);
		System.out.println("==========================");
		b.getList();
		System.out.println("==========================");
	}

}
