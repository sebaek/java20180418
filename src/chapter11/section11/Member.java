package chapter11.section11;

public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
