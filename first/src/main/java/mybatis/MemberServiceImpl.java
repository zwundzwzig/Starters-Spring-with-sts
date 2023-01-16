package mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemberServiceImpl implements MemberService {
	
	MemberDAO dao;

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<MemberDTO> memberList() {
		return dao.memberList();
	}

	@Override
	public int memberCount() {
		return dao.memberCount();
	}

	@Override
	public MemberDTO oneMember(String id) {
		return dao.oneMember(id);
	}

	@Override
	public List<MemberDTO> pagingList(int[] limit) {
		return dao.pagingList(limit);
	}

	@Override
	public int insertMember(MemberDTO dto) {
		MemberDTO dto2 = dao.oneMember(dto.getId());
		if(dto2 == null) return dao.insertMemeber(dto);
		return 0;
	}

	@Override
	public int updateMember(MemberDTO dto) {
		return dao.updateMemeber(dto);
	}

	@Override
	public int deleteMember(MemberDTO dto) {
		return dao.deleteMember(dto);
	}

	@Override
	public List<MemberDTO> searchMember(HashMap<String, String> map) {
		return dao.searchMember(map);
	}

	@Override
	public List<MemberDTO> addressSearch(ArrayList<String> addressList) {
		return dao.addressSerch(addressList);
	}

	@Override
	public List<MemberDTO> combination(MemberDTO dto) {
		return dao.combination(dto);
	}

	@Override
	public List<HashMap<String, String>> memberBoard(String writer) {
		return dao.memberBoard(writer);
	}

}
