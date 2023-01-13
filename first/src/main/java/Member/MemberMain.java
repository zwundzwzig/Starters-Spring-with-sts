package Member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("Member/member.xml");
		MemberDAO dao = factory.getBean("dao", MemberDAO.class);
//		MemberDTO dto1 = factory.getBean("dto1", MemberDTO.class);
//		MemberDTO dto2 = factory.getBean("dto2", MemberDTO.class);
//		MemberDTO dto3 = factory.getBean("dto3", MemberDTO.class);
		
		boolean isLogin = dao.selectMember();
		if(isLogin) System.out.println(dao.dto.getId() + " 회원님 정상 로그인 하셨습니다.");
		else dao.insertMember();
	}

}
