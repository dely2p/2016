package d20160519;

import java.awt.HeadlessException;

public class Triangle extends Figure{

	
	Triangle(){									// ������
		width = 3;
		height = 2 ;
	}

	@Override
	public void getCalArea(){					// getCalArea method(�������̵�)
		int area = (width*height)/2;
		System.out.println("���̴� : "+area);
	}
	public static void main(String[] args) {
		Triangle t = new Triangle();			// Triangle Ŭ����
		t.setHeight(5);
		t.setWidth(4);
		t.getCalArea();
	}
}
