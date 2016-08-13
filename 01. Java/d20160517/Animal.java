package d20160517;

public class Animal {												// Animal 클래스
	private String name;											// 멤버변수 선언
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
	
	Animal(String name, int age){									// 생성자
		this.name = name;											// 입력받은 값으로
		this.age = age;												// 각각 데이터 초기화
	}
	
	public void Show( ){											// method show
		System.out.println( name + "는(은) " + age + " 살입니다."); 		// 값 출력
	}
}
