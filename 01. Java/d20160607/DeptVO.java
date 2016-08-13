package d20160607;

// �μ� ���� 1���� ������ �ִ� ��ü
// VO : Value Object
public class DeptVO {
	// 1���� ���ڵ带 ���� �� �ְ� �÷����� ��� ���������� 
	private int deptno;
	private String dname;
	private String loc;
	
	// setter, getter, �⺻������, �Ű����� �ִ� ������
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public DeptVO() {

	}
	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	

	
}
