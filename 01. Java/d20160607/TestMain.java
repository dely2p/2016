package d20160607;

import java.util.ArrayList;
// CRUD)(create read update delete)
public class TestMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		/*ArrayList<DeptVO> list = dao.selectAll(); // db모두 가져옴
		
		for(DeptVO vo : list){
			System.out.println("----------------------");
			System.out.println("부서번호 : "+vo.getDeptno());
			System.out.println("부서번호 : "+vo.getDname());
			System.out.println("부서번호 : "+vo.getLoc());
			//System.out.println(list);
		}*/
		/*DeptVO vo = dao.selectOne(10);
		System.out.println("----------------------");
		System.out.println("부서번호 : "+vo.getDeptno());
		System.out.println("부서번호 : "+vo.getDname());
		System.out.println("부서번호 : "+vo.getLoc());*/
		
		// insert
		/*DeptVO vo2 = new DeptVO(99,"개발","평창");
		dao.insertOne(vo2);	*/	
		
		// delete
//		dao.deleteOne(2);
		
		// update
		/*DeptVO vo3 = new DeptVO(10,"회계","LA");
		dao.updateOne(vo3);*/
		
		// 접속종료
		dao.close();
		
	}
}
