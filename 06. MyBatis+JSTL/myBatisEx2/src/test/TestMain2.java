package test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import vo.EmpVO;

public class TestMain2 {
	public static void main(String[] args) throws IOException {
		Reader r = Resources.getResourceAsReader("config/sqlMapConfig.xml");
		
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = ssfb.build(r);
		
		//r.close();
		
		SqlSession ss = factory.openSession(true);
		System.out.println("ss : "+ss);
		
		
		List<EmpVO> list =  ss.selectList("empselectAll");
		for(EmpVO vo : list){
			System.out.println(vo.getEmpno()+" : "+vo.getEname()+" : "+vo.getJob()+" : "+vo.getMgr()+" : "+vo.getHiredate()
			+" : "+vo.getSal()+" : "+vo.getComm()+" : "+vo.getDeptno());
		}
		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 사원번호 입력: ");
		int empno = sc.nextInt();
						
		//ss.selectOne("등록되어 있는 sql문의 별칭", 전달객체);
		Object obj = ss.selectOne("empOne", empno);
		EmpVO vo = (EmpVO)obj;
		System.out.println("사원번호 : "+vo.getEmpno());
		System.out.println("사원명 : "+vo.getEname());
		System.out.println("사원부서 : "+vo.getJob());
		System.out.println("상사 : "+vo.getMgr());
		System.out.println("입사일 : "+vo.getHiredate());
		System.out.println("월급 : "+vo.getSal());
		System.out.println("보너스 : "+vo.getComm());
		System.out.println("부서번호 : "+vo.getDeptno());
		  
		System.out.println("--------------------------------");
		System.out.println("입력한 사원번호 : " );
		int eno = sc.nextInt();
		System.out.println("입력할 사원명 : " );
		String ename = sc.next();
		System.out.println("입력할 사원부서 : ");
		String job = sc.next();
		System.out.println("입력할 상사 : ");
		int mgr = sc.nextInt();
		System.out.println("입력할 입사일 : ");
		String hiredate = sc.next();
		System.out.println("입력할 월급 : ");
		int sal = sc.nextInt();
		System.out.println("입력할 보너스 : ");
		int comm = sc.nextInt();
		System.out.println("입력할 부서번호 : ");
		int deptno = sc.nextInt();
		EmpVO vo1 = new EmpVO(eno, ename, job, mgr, hiredate, sal, comm, deptno); 
		ss.insert("insertEmp",vo1);
		
		System.out.println("---------------------------------");
		System.out.println("삭제할 부서번호 입력: ");
		int deleno = sc.nextInt();
		ss.delete("deleteEmp",deleno);
		
		
		*/
		
		ss.close();
		
	}
}
