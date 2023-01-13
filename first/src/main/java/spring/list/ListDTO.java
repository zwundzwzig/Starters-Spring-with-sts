package spring.list;

import java.util.ArrayList;

public class ListDTO {
	ArrayList<String> list;

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ListDTO [list=" + list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4) + "]";
	}

}
