package d20160530;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost(); // host 이름을 받아옴
		String name = inet.getHostName(); // 받아온 hostname을 변수에 넣음
		System.out.println("name : "+name);
		System.out.println("ip : "+inet.getHostAddress());
		
		//InetAddress inet2 = InetAddress.getByName("www.naver.com"); // 한개의 아이피를 받아옴
		InetAddress[] inet2 = InetAddress.getAllByName("www.naver.com"); // 여러개의 아이피를 받아옴
		for(InetAddress ia : inet2){
			System.out.println("네이버 아이피 : "+ia.getHostAddress());
		}
	}
}
