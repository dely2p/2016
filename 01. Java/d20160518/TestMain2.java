package d20160518;

public class TestMain2 {
	public static void main(String[] args) {
	/*
		Parent p = new Parent();		
		Child c = new Child();
		Child c2; 

		p = c;							// 부모, 자식 관계이기때문에 부모참조변수에 자식 참조값을 담을 수 있음
		p.먹기();							// 가능
		p.노래부르기();						// 부모가 알고있는 method는 호출 가느
		//p.클럽가기();					// 부모가 모르는 method는 호출 불가능
		
		//c = p;						// 부모참조변수 = 자식참조값만 가능(반대로는 값의 존재여부를 알 수 없기 때문에 할 수 없음)
		
		c2 = (Child)p;					// p가 담고 있는 값이 c이기때문에 형변환만하면 가능함
		c2.클럽가기(); 					// 클럽가기 method가능
		*/
		
		Parent p = new Child();			// Parent와 Child는 부모자식관계(stack은 p로 heap은 Child클래스로 배정됨)
		p.먹기();
	}
}
