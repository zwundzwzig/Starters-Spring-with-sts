package MemberServiceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public abstract class MemberJanService implements MemberService {
	@Autowired
	MemberDAO mdao;
	@Autowired
	PointDAO pdao;

	@Override
	public void registerMember() {
		boolean isLogin = mdao.selectMember();
		if(!isLogin) {
			mdao.insertMember();
//			pdao.setPoint(10000);
			System.out.println(pdao.getPoint());
		}
	}

//	public void setMemberdao(MemberDAO mdao) {
//		this.mdao = mdao;
//	}
//
//	public void setPointdao(PointDAO pdao) {
//		this.pdao = pdao;
//	}

}
