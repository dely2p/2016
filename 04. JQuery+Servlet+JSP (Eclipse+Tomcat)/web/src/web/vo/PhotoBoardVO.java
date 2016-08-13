package vo;

public class PhotoBoardVO {

	private int pno;
	private String title;
	private String contents;
	private String writer;
	private String filename;
	private String regdate;
	
	public PhotoBoardVO() {
		super();
	}
	public PhotoBoardVO(int pno, String title, String contents, String writer, String filename, String regdate) {
		super();
		this.pno = pno;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.filename = filename;
		this.regdate = regdate;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
