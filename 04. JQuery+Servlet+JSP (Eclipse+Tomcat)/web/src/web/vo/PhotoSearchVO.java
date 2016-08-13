package vo;

public class PhotoSearchVO {
	String name;
	String imgpath;
	
	public PhotoSearchVO() {
		super();
	}
	public PhotoSearchVO(String name, String imgpath) {
		super();
		this.name = name;
		this.imgpath = imgpath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	
}
