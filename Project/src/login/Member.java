package login;

public class Member {
	private String userId;
	private String userPassword;
	private String userName;
	private String userPhone;
	
	public Member(String userId, String userPassword, String userName,String userPhone) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userPhone = userPhone;	
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public void prt() {
		System.out.println("사용자 이름: "+ this.userName);
		System.out.println("사용자 폰번호: "+ this.userPhone);
		System.out.println(this.userPassword);
		System.out.println(this.userId);
	}
}
