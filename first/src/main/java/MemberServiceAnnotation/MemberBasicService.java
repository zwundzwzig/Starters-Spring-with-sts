package MemberServiceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service("service")
public class MemberBasicService implements MemberService {
	@Autowired
	MemberDAO dao;
	
//	public void setDao(MemberDAO dao) {
//		this.dao = dao;
//	} autowired로 변수 인계 받으면 setter 피요없다.
	
	@Override
	public void registerMember() {
		boolean isLogin = dao.selectMember();
		if(!isLogin) dao.insertMember();
	}

}
