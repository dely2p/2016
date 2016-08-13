package d20160518;

public class Person {
	int 눈, 코, 입, 귀;														// 멤버변수
	private String name, gender, job;
	int age;

	public Person(){														// 기본생성자
		눈 = 2;
		코 = 1;
		입 = 1;
		귀 = 2;
		name = "홍길동";
		gender = "남";
		job = "도적";
		age = 18;
		System.out.println("Person의 기본생성자");
	}
	
	public Person(String name, String gender, String job, int age) {		// 매개변수가 4개인 생성자
		//super();
		this();	// 기본생성자를 호출(항상 생성자의 첫 라인에 들어가야함)
		this.name = name;
		this.gender = gender;
		this.job = job;
		this.age = age;
	}
	
	// 4개의 변수의 setter, getter
	public String getName() {												// getter name
		return name;
	}

	public void setName(String name) {										// setter name
		this.name = name;
	}

	public String getGender() {												// getter gender
		return gender;
	}

	public void setGender(String gender) {									// setter gender
		this.gender = gender;
	}

	public String getJob() {												// getter job
		return job;
	}

	public void setJob(String job) {										// setter job
		this.job = job;
	}

	public int getAge() {													// getter age
		return age;
	}

	public void setAge(int age) {											// setter age
		this.age = age;
	}
	
	
	public void 먹기(){
		System.out.println("맛난걸 먹어요 ^^");
	}
	
	public void 생각하기(){
		System.out.println("생각한다 고로 존재한다.");
	}
	
	public void 자기(){
		System.out.println("쿨쿨 자요!~~~");
	}
}
