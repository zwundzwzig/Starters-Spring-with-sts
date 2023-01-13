package MemberServiceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import MemberServiceAnnotation.MemberDTO;

@Repository("mdao")
public class MemberDAO {
	@Autowired //dto1, 2, 3
	@Qualifier("dto1")
	MemberDTO dto;
	
	public boolean selectMember() {
		if(dto.getId().equals("spring") && dto.getPw().equals("1111")) return true;
		else return false;
	}
	
	public void insertMember() {
		System.out.println(dto.getId() + " 회원님 가입 완료!");
	}
}
