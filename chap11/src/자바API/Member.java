package 자바API;

public class Member {
	public String id;

	public Member(String id) {
		super();
		this.id = id;
	}
	
	public boolean equals(Object object) {
		if (object instanceof Member) {
			Member member = (Member) object;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
