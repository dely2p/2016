package d20160530;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost(); // host �̸��� �޾ƿ�
		String name = inet.getHostName(); // �޾ƿ� hostname�� ������ ����
		System.out.println("name : "+name);
		System.out.println("ip : "+inet.getHostAddress());
		
		//InetAddress inet2 = InetAddress.getByName("www.naver.com"); // �Ѱ��� �����Ǹ� �޾ƿ�
		InetAddress[] inet2 = InetAddress.getAllByName("www.naver.com"); // �������� �����Ǹ� �޾ƿ�
		for(InetAddress ia : inet2){
			System.out.println("���̹� ������ : "+ia.getHostAddress());
		}
	}
}
