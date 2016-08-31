package kr.co.test.web.dto;

// Data Transfer Object
public class MemberDTO {
	String id;
	String pw;
	String confirm;
	String email;
	
	public MemberDTO() {
		super();
	}
	
	public MemberDTO(String id, String pw, String confirm, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.confirm = confirm;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
