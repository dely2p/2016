import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.DeptVO;

public class TestMain {
	public static void main(String[] args) throws IOException {
		// JDBC DB 연결객체? Connection ==> SqlSession 객체
		
		// 1. MyBatis 설정 xml 파일 읽기
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		// 2. db 연결
		
		// db 연결 객체 ==> 자동차 비유
		// 자동차 ==> SqlSession
		
		// 자동차 공장 ==> sqlSessionFactory
		
		// 공장 건설 인부 ==> SqlSessionFactoryBuilder
		
		// 인부 생성
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		// 공장 건설
		SqlSessionFactory factory = ssfb.build(r);
		
		r.close(); // r IO 객체
		
		// 자동차 생선
		SqlSession ss = factory.openSession(true);
		// true : autocommit
		// false : no autoCommit
		System.out.println("ss : "+ss);
		// 전체 조회
		
		List<DeptVO> list =  ss.selectList("deptSelectAll");
		for(DeptVO vo : list){
			System.out.println(vo.getDeptno()+" : "+vo.getDname()+" : "+vo.getLoc());
		}
		
		// 부서 정보 입력받기
		Scanner sc = new Scanner(System.in);
		/*	
		System.out.println("검색할 부서번호 입력: ");
		int deptno = sc.nextInt();
						
		//ss.selectOne("등록되어 있는 sql문의 별칭", 전달객체);
		Object obj = ss.selectOne("deptOne", deptno);
		DeptVO vo = (DeptVO)obj;
		System.out.println("부서번호 : "+vo.getDeptno());
		System.out.println("부서명 : "+vo.getDname());
		System.out.println("위치 : "+vo.getLoc());
		  
		System.out.println("--------------------------------");
		System.out.println("입력한 부서번호 : " );
		int dno = sc.nextInt();
		System.out.println("입력할 부서명 : " );
		String dname = sc.next();
		System.out.println("입력할 부서의 위치 : ");
		String loc = sc.next();
		DeptVO vo1 = new DeptVO(dno, dname, loc);
		ss.insert("insertDept",vo1);
		
		System.out.println("---------------------------------");
		System.out.println("삭제할 부서번호 입력: ");
		int deldno = sc.nextInt();
		ss.delete("deleteDept",deldno);
		*/
		
		
		
		ss.close();
	}
}
