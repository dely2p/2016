package d20160607;

public class TestMain1 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		// selectAll
		/*ArrayList<EmpVO> list = dao.selectAll();
			
		for(EmpVO vo : list){

			System.out.println("----------------------");
			System.out.println("직원번호 : "+vo.getEmpno());
			System.out.println("이름 : "+vo.getEname());
			System.out.println("업무 : "+vo.getJob());
			System.out.println("상사 : "+vo.getMgr());
			System.out.println("입사일 : "+vo.getHiredate());
			System.out.println("급여 : "+vo.getSal());
			System.out.println("수당 : "+vo.getComm());
			System.out.println("부서번호 : "+vo.getDeptno());

			//System.out.println(list);
		}*/
		
		// selectOne
		/*EmpVO vo = dao.selectOne(7369);
		System.out.println("----------------------");
		System.out.println("직원번호 : "+vo.getEmpno());
		System.out.println("이름 : "+vo.getEname());
		System.out.println("업무 : "+vo.getJob());
		System.out.println("상사 : "+vo.getMgr());
		System.out.println("입사일 : "+vo.getHiredate());
		System.out.println("급여 : "+vo.getSal());
		System.out.println("수당 : "+vo.getComm());
		System.out.println("부서번호 : "+vo.getDeptno());*/
			
		// insert
		/*EmpVO vo2 = new EmpVO(99,"Chris","programer",7822, 5000, 6000, 10);
		dao.insertOne(vo2);*/		
			
		// delete
		dao.deleteOne(99);
			
		// update
/*		EmpVO vo3 = new EmpVO(100,"Chris","SALESMAN",7822, 5000, 6000, 10);
		dao.updateOne(vo3);*/
			
			// 접속종료
//			dao.close();
	}	

}
