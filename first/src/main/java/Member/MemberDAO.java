package Member;

public class MemberDAO {
	MemberDTO dto;
//	<property name="dto" ref="dto" />
	public void setDto(MemberDTO dto) {
		this.dto = dto;
	}
	
	public boolean selectMember() {
		if(dto.getId().equals("spring") && dto.getPw().equals("1111")) return true;
		else return false;
	}
	
	public void insertMember() {
		System.out.println(dto.getId() + " 회원님 가입 완료!");
	}
}
