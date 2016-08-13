package d20160518;

public class CellPhone extends Phone{			// Phone 상속받음
	
	
	CellPhone(){								// 생성자
		
	}
	
	void 문자보내기(String textmsg){				// 문자보내기 method
		System.out.println(textmsg+" 전송완료!");
	}
	void 보글보글게임(){								// 보글보글게임 method
		System.out.println("보글보글~~~!!");
	}
}
