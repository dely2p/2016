package d20160519;

public class Square extends Figure{
		
	Square(){									// Square ������
		width = 1;
		height = 1;
	}
	
	@Override
	public void getCalArea(){					// getCalArea method(�������̵�)
		int area = width*height;
		System.out.println("���̴� : "+area);
	}
	public static void main(String[] args) {
		Square sq = new Square();				// Square Ŭ����
		sq.setHeight(6);
		sq.setWidth(8);
		sq.getCalArea();
	}
}
