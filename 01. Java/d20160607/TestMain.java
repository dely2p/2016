package d20160607;

import java.util.ArrayList;
// CRUD)(create read update delete)
public class TestMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		/*ArrayList<DeptVO> list = dao.selectAll(); // db��� ������
		
		for(DeptVO vo : list){
			System.out.println("----------------------");
			System.out.println("�μ���ȣ : "+vo.getDeptno());
			System.out.println("�μ���ȣ : "+vo.getDname());
			System.out.println("�μ���ȣ : "+vo.getLoc());
			//System.out.println(list);
		}*/
		/*DeptVO vo = dao.selectOne(10);
		System.out.println("----------------------");
		System.out.println("�μ���ȣ : "+vo.getDeptno());
		System.out.println("�μ���ȣ : "+vo.getDname());
		System.out.println("�μ���ȣ : "+vo.getLoc());*/
		
		// insert
		/*DeptVO vo2 = new DeptVO(99,"����","��â");
		dao.insertOne(vo2);	*/	
		
		// delete
//		dao.deleteOne(2);
		
		// update
		/*DeptVO vo3 = new DeptVO(10,"ȸ��","LA");
		dao.updateOne(vo3);*/
		
		// ��������
		dao.close();
		
	}
}
