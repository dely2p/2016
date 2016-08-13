package test;

import dao.MemberDAO;
import vo.MemberVO;

public class TestMain {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.selectOne("EJ", "TEST123");
		System.out.println(vo.getName());
	}
}
