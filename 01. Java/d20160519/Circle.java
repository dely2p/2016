package d20160519;

public class Circle extends Figure{
			
	Circle(){								// ������
		r = 5;
	}

	@Override
	public void getCalArea(){				// getCalArea method(�������̵�)
		double area = 3.14*r*r;
		System.out.println("���̴� : "+area);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();			// Circle Ŭ����
		c.setR(7);
		c.getCalArea();
	}
}
