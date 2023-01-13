package MemberService;

public abstract class MemberJanService implements MemberService {
	
	MemberDAO mdao;
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

	public void setMemberdao(MemberDAO mdao) {
		this.mdao = mdao;
	}

	public void setPointdao(PointDAO pdao) {
		this.pdao = pdao;
	}

}
