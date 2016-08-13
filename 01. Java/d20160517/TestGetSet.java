package d20160517;

public class TestGetSet {
	private int data;									// 멤버변수 data 선언 
	private String str;									// 멤버변수 str 선언
	private float value;								// 멤버변수 value 선언
	
	TestGetSet(){										// 생성자
		data = 10;
		str = "Hello";
		value = 99.9f;
	}

	TestGetSet(int data, String str, float value){		// 매개변수가 3개인 생성자
		this.data = data;								
		this.str = str;
		this.value = value;
	}
	
	public int getData(){								// data getter
		return data;
	}
	public void setData(int d){							// data setter
		data = d;
	}
	public String getStr(){								// str getter
		return str;
	}
	public void setStr(String s){						// str setter
		str = s;
	}
	public float getValue(){							// value getter
		return value;
	}
	public void getValue(float v){						// value setter
		value = v;
	}
}
