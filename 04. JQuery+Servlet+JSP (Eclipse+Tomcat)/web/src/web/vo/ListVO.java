package vo;

public class ListVO {
	int gno;
	String writer;
	String contents;
	String regdate;
	
	public ListVO() {
		super();
	}	
	
	public ListVO(int gno, String writer, String contents, String regdate) {
		super();
		this.gno = gno;
		this.writer = writer;
		this.contents = contents;
		this.regdate = regdate;
	}

	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}	
}
