package d20160517;

public class TestGetSet {
	private int data;									// ������� data ���� 
	private String str;									// ������� str ����
	private float value;								// ������� value ����
	
	TestGetSet(){										// ������
		data = 10;
		str = "Hello";
		value = 99.9f;
	}

	TestGetSet(int data, String str, float value){		// �Ű������� 3���� ������
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
