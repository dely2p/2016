package vo;
// VO(Value Object), DTO, JavaBean
public class DeptVO {
	// 테이블의 컬럼명을 멤버 변수로
	int deptno;	
	String dname;
	String loc;
	
	// setter, getter,
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
	
	// 기본생성자, 매개변수 있는 생성자
	public DeptVO() {
		
	}
	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	
}
