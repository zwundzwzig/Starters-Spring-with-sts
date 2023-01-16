package mybatis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		// mybatis 설정 파일 읽을 객체 준비
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("mybatis/mybatis-config.xml"));
		// mybatis-config.xml 설정대로 연결
		SqlSession session = factory.openSession(true); //인자가 true면 실제 DB에 적용됨
		// db connection
		
//		MemberDTO dto = session.selectOne("member.memberList");
//		List<MemberDTO> memberList = session.selectList("member.memberList");
//		System.out.println(dto);
		// sql-mapping.xml id=memberList resultType 호출
		
		MemberDAO dao = new MemberDAO();
		dao.setSession(session);
		MemberService service = new MemberServiceImpl();
		((MemberServiceImpl) service).setDao(dao);

		for(MemberDTO member : service.memberList()) { System.out.println(member); }
		
		System.out.println(service.memberCount());
		System.out.println(service.oneMember("10"));
		
		int[] limit = {0, 3};
		for(MemberDTO page : service.pagingList(limit)) { System.out.println(page); }
		
//		MemberDTO insertdto = new MemberDTO();
//		insertdto.setId("2");
//		insertdto.setPw("mybatis");
//		insertdto.setName("myBatis");
//		insertdto.setPhone("01012345930");
//		insertdto.setEmail("my@batis.com");
//		insertdto.setAddress("서울시 강남구");
//		service.insertMember(insertdto);
		
//		MemberDTO updatedto = service.oneMember("2");
//		updatedto.setName("박한국");
//		updatedto.setPhone("01087654321");
//		updatedto.setEmail("batis@my.com");
//		service.updateMember(updatedto);
		
//		MemberDTO deletedto = service.oneMember("sadf");
//		service.deleteMember(deletedto);
		
//		HashMap<String, String> map = new HashMap();
//		map.put("key", "name");
//		map.put("value", "씽크%");
//		for(MemberDTO search : service.searchMember(map)) { System.out.println(search); }
		
//		ArrayList<String> addressList = new ArrayList<String>();
//		addressList.add("용산구 치평동");
//		addressList.add("서울시 강남구");
//		for(MemberDTO address : service.addressSearch(addressList)) { System.out.println(address); }
		
		MemberDTO dto = new MemberDTO();
		dto.setName("씽크빅");
		dto.setEmail("");
		for(MemberDTO com : service.combination(dto)) { System.out.println(com); }
		
		for(HashMap<String, String> board : service.memberBoard("1")) { 
			Set<String> keys = board.keySet();
			for(String key : keys) { System.out.print(key + " : " + board.get(key) + ", "); }
			System.out.println();
		}
	}
}
