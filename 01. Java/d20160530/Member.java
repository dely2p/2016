package d20160530;

import java.io.Serializable;

public class Member implements Serializable{ // ����ȭ�� ������ Ŭ���� 
	int memno;
	String name;
	String id;
	transient String pw; // ����ȭ �� �� ������
	//String pw;
	String tel;
	
	// �⺻������
	public Member(){
		
	}
	// �Ű����� �ִ� ������
	public Member(int memno, String name, String id, String pw, String tel){
		this.memno = memno;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
	}
	// setter, getter
	public int getMemno() {
		return memno;
	}
	public void setMemno(int memno) {
		this.memno = memno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
