package d20160518;

public class Person {
	int ��, ��, ��, ��;														// �������
	private String name, gender, job;
	int age;

	public Person(){														// �⺻������
		�� = 2;
		�� = 1;
		�� = 1;
		�� = 2;
		name = "ȫ�浿";
		gender = "��";
		job = "����";
		age = 18;
		System.out.println("Person�� �⺻������");
	}
	
	public Person(String name, String gender, String job, int age) {		// �Ű������� 4���� ������
		//super();
		this();	// �⺻�����ڸ� ȣ��(�׻� �������� ù ���ο� ������)
		this.name = name;
		this.gender = gender;
		this.job = job;
		this.age = age;
	}
	
	// 4���� ������ setter, getter
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
	
	
	public void �Ա�(){
		System.out.println("������ �Ծ�� ^^");
	}
	
	public void �����ϱ�(){
		System.out.println("�����Ѵ� ��� �����Ѵ�.");
	}
	
	public void �ڱ�(){
		System.out.println("���� �ڿ�!~~~");
	}
}
