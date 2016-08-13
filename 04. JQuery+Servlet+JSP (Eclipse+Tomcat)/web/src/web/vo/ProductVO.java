package vo;

public class ProductVO {
	private int pno;
	private String pname;
	private int price;
	private int quantity;
	private String imgfile;
	private String pdesc;

	

	public ProductVO() {
		
	}
	
	public ProductVO(int pno, String pname, int price, int quantity, String imgfile, String pdesc) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.imgfile = imgfile;
		this.pdesc = pdesc;
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getImgfile() {
		return imgfile;
	}
	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}
	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}




	
	
}
