package d20160519;

public abstract class Figure {

	int width, height, r;					// �������
	
	public int getWidth() {					// getter, setter
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public abstract void getCalArea();		// �߻�޼���
}
