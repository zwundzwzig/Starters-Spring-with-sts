package mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {

	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	public List<MemberDTO> memberList() {
		return session.selectList("member.memberList");
	}
	
	public int memberCount() {
		return session.selectOne("member.memberCount");
	}
	
	public MemberDTO oneMember(String id) {
		return session.selectOne("member.oneMember", id);
	}

	public List<MemberDTO> pagingList(int[] limit) {
		return session.selectList("member.pagingList", limit);
	}

	public int insertMemeber(MemberDTO dto) {
		return session.insert("insertMember", dto);
	}

	public int updateMemeber(MemberDTO dto) {
		return session.update("updateMember", dto);
	}

	public int deleteMember(MemberDTO dto) {
		return session.delete("deleteMember", dto);
	}

	public List<MemberDTO> searchMember(HashMap<String, String> map) {
		return session.selectList("searchMember", map);
	}

	public List<MemberDTO> addressSerch(ArrayList<String> addressList) {
		return session.selectList("addressSearch", addressList);
	}

	public List<MemberDTO> combination(MemberDTO dto) {
		return session.selectList("combination", dto);
	}
	
	public List<HashMap<String, String>> memberBoard(String writer) {
		return session.selectList("memberBoard", writer);
	}
}
