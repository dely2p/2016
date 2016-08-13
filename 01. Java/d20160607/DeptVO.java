package d20160607;

// 부서 정보 1개를 가지고 있는 객체
// VO : Value Object
public class DeptVO {
	// 1개의 레코드를 담을 수 있게 컬럼명을 멤버 변수명으로 
	private int deptno;
	private String dname;
	private String loc;
	
	// setter, getter, 기본생성자, 매개변수 있는 생성자
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
