package d20160519;

import java.awt.HeadlessException;

public class Triangle extends Figure{

	
	Triangle(){									// 생성자
		width = 3;
		height = 2 ;
	}

	@Override
	public void getCalArea(){					// getCalArea method(오버라이딩)
		int area = (width*height)/2;
		System.out.println("넓이는 : "+area);
	}
	public static void main(String[] args) {
		Triangle t = new Triangle();			// Triangle 클래스
		t.setHeight(5);
		t.setWidth(4);
		t.getCalArea();
	}
}
