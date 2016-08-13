package d20160519;

public class Square extends Figure{
		
	Square(){									// Square 생성자
		width = 1;
		height = 1;
	}
	
	@Override
	public void getCalArea(){					// getCalArea method(오버라이딩)
		int area = width*height;
		System.out.println("넓이는 : "+area);
	}
	public static void main(String[] args) {
		Square sq = new Square();				// Square 클래스
		sq.setHeight(6);
		sq.setWidth(8);
		sq.getCalArea();
	}
}
