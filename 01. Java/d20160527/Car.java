package d20160527;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	Random rnd = new Random();			// ���� ����
	ArrayList<String> list;				
	String[] carNameList = {
			"�ƿ��","����","�غ���","Ÿ��"
	};
	
	Car(){
		list = new ArrayList<String>();		// ArrayLists ����
	}
	public synchronized void push(String car){
		System.out.println("������� : "+list);
		System.out.println("�ڵ����� ����Ǿ����ϴ� "+car);
		list.add(car);
		// ��ٸ��� �ִ� ȣ���� �Ͼ����
		//notify(); // �ϳ��� wait() ����(� ���� ��� �ȱ���� �� ���� ����)
		notifyAll(); //-> ��� �ٱ����� ���� 
	}
	// ������ �޼��� pop()
	//	a	b	c	d	==>	size() 4
	//	0	1	2	3
	
	public synchronized String pop(){
		if(list.size()==0){							// ���� �ƹ��͵� ������
			System.out.println("ȣ���� ��ٸ�����");		// ��ٸ���� �޽����� �Բ�
			try {
				wait();								// wait() ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			String carName = list.remove(list.size()-1); // �� ���� �ִ� ��� ���鼭 ������
			System.out.println("����մϴ� : "+carName);
			
		return carName;
	}
	
	// �����̸� ������
	public synchronized String getCar(){
		// �����ϰ� ���� �̸� ������
		int val = rnd.nextInt(carNameList.length);
		return carNameList[val];
	}

}
