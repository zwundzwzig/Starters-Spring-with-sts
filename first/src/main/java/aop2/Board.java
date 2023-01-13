package aop2;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component()
public class Board {
	
	public void insert(int seq) {
		System.out.println(seq + " 번째 게시글");
	}
	
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList();
		list.add("number 1");
		list.add("number 2");
		list.add("number 3");
		list.add("number 4");
		list.add("number 5");
		
		return list;
	}
	
}
