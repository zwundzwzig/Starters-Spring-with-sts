package aop2;
import org.springframework.stereotype.Component;

@Component
public class Member {
	
	void logIn(String id) {
		System.out.println(id + " 회원님 로그인 하셨습니다.");
	}
	
	public void logOut() {
		System.out.println("안녕히 가세요");
	}
	
	void insert(String id, int pw) {
		System.out.println("id : " + id + " pw : " + pw);
	}
	
}
