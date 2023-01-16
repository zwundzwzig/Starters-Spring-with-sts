package mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface MemberService {
	public List<MemberDTO> memberList();
	public int memberCount();
	public MemberDTO oneMember(String id);
	public List<MemberDTO> pagingList(int[] limit);
	public int insertMember(MemberDTO dto);
	public int updateMember(MemberDTO dto);
	public int deleteMember(MemberDTO dto);
	public List<MemberDTO> searchMember(HashMap<String, String> map);
	public List<MemberDTO> addressSearch(ArrayList<String> addressList);
	public List<MemberDTO> combination(MemberDTO dto);
	public List<HashMap<String, String>> memberBoard(String writer);
}
