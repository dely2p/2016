package d20160519;

public class Circle extends Figure{
			
	Circle(){								// 생성자
		r = 5;
	}

	@Override
	public void getCalArea(){				// getCalArea method(오버라이딩)
		double area = 3.14*r*r;
		System.out.println("넓이는 : "+area);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();			// Circle 클래스
		c.setR(7);
		c.getCalArea();
	}
}
