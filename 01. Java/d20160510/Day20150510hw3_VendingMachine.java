package d20160510;

import java.util.Scanner;

/*1. ����ڷκ��� ���ڸ� �Է¹޴´�. 

�������Է��ϼ��� : 50000

1. �ݶ�       : 1200��
2. ���̴�     : 2500��
3. ����ź��� : 120��

2. �޴��� �����ϼ��� :  2
3. �? 3 
4. ���̴� 3�� 
�ܵ� : 42500�Դϴ�. 
����   : 4��
õ��   : 2��
����� : 1��
*/
public class Day20150510hw3_VendingMachine {
	public static void main(String[] args) {
		String menuname = "";									// �޴� �̸��� ���� String�� menuname ����
		int menuval = 0;										// �޴��� ���� ���� int�� menuval ����
		int man=0, chun=0, obak=0;								// ����, õ��, ������� ���� ���� ���� ����
		Scanner sc = new Scanner(System.in);					// ��ĳ�� ����
		System.out.print("������ �Է��ϼ��� : ");						// ���� �Է��ϴ� ���ڿ� ���
		int money = sc.nextInt();								// ����ڷκ��� �� �Է¹���
		
		System.out.println("1. �ݶ�\t\t: 1200��");					// �޴� 1 �ݶ�, ���� ���ڿ� ���
		System.out.println("2. ���̴�\t\t: 2500��");				// �޴� 2 ���̴�, ���� ���ڿ� ���
		System.out.println("3. ����ź���\t: 120��");				// �޴� 3 �ݶ�, ���� ���ڿ� ���		
		System.out.print("�޴��� �����ϼ��� : ");						// �޴� ���� ���ڿ� ���
		
		int menu = sc.nextInt();								// ����ڷκ��� �޴� ��ȣ �Է¹���
		switch(menu){											// switch���� ����ؼ� �޴� ���� �ش� ������ �����Ŵ
		case 1:													// menu=1�̶��
			menuname = "�ݶ�";									// menuname�� �ݶ� ���ڿ� ����
			menuval = 1200;										// menuval�� 1200 ���� ����
			break;												// ���������� break
		case 2:
			menuname = "���̴�";									// menuname�� ���̴� ���ڿ� ����
			menuval = 2500;										// menuval�� 2500 ���� ����
			break;												// ���������� break
		case 3:
			menuname = "����ź���";								// menuname�� ����ź��� ���ڿ� ����
			menuval = 120;										// menuval�� 120 ���� ����
			break;												// ���������� break
		default:												// �� �ܿ���
			System.out.println("�Է°� ����!");	// �Է� ���� ��
		}		
		System.out.print("�? ");								// �� ���� �������� ���ڿ� ���
		int num = sc.nextInt();									// �� �� �������� �Է¹���
		System.out.println(menuname+" "+num+"��");				// ������ �޴��̸��� ���� ���
		
		int change = money - (menuval*num);						// �ܵ� ���
		System.out.println("�ܵ� : " + change + "�Դϴ�.");			// �ܵ� ���
		
		if(change/10000>0){										// ���� �ڸ����� ������
			man = change/10000;									// ���� ����� ���� man�� ����
		}
		if(change%10000/1000>0){								// õ�� �ڸ����� ������
			chun = change%10000/1000;							// õ�� ����� ���� chun�� ����
		}
		if(change%1000/500>0){									// ����� �ڸ����� ������
			obak = change%1000/500;								// ����� ������ obak�� ����
		}
		
		System.out.println("���� : "+man+"��");					// ���� ��� ���
		System.out.println("õ�� : "+chun+"��");					// õ�� ��� ���
		System.out.println("����� : "+obak+"��");					// ����� ��� ���		
	}
}
