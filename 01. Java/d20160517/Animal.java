package d20160517;

public class Animal {												// Animal Ŭ����
	private String name;											// ������� ����
	private int age;
	
	public String getName(){										// getter(Name)
		return name;
	}
	public void setName(String name){								// setter(Name)
		this.name = name;
	}
	public int getAge(){											// getter(Age)
		return age;
	}
	public void setAge(int age){									// setter(Age)
		this.age = age;
	}	
	
	Animal(String name, int age){									// ������
		this.name = name;											// �Է¹��� ������
		this.age = age;												// ���� ������ �ʱ�ȭ
	}
	
	public void Show( ){											// method show
		System.out.println( name + "��(��) " + age + " ���Դϴ�."); 		// �� ���
	}
}
