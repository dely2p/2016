package d20160607;

public class TestMain1 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		// selectAll
		/*ArrayList<EmpVO> list = dao.selectAll();
			
		for(EmpVO vo : list){

			System.out.println("----------------------");
			System.out.println("������ȣ : "+vo.getEmpno());
			System.out.println("�̸� : "+vo.getEname());
			System.out.println("���� : "+vo.getJob());
			System.out.println("��� : "+vo.getMgr());
			System.out.println("�Ի��� : "+vo.getHiredate());
			System.out.println("�޿� : "+vo.getSal());
			System.out.println("���� : "+vo.getComm());
			System.out.println("�μ���ȣ : "+vo.getDeptno());

			//System.out.println(list);
		}*/
		
		// selectOne
		/*EmpVO vo = dao.selectOne(7369);
		System.out.println("----------------------");
		System.out.println("������ȣ : "+vo.getEmpno());
		System.out.println("�̸� : "+vo.getEname());
		System.out.println("���� : "+vo.getJob());
		System.out.println("��� : "+vo.getMgr());
		System.out.println("�Ի��� : "+vo.getHiredate());
		System.out.println("�޿� : "+vo.getSal());
		System.out.println("���� : "+vo.getComm());
		System.out.println("�μ���ȣ : "+vo.getDeptno());*/
			
		// insert
		/*EmpVO vo2 = new EmpVO(99,"Chris","programer",7822, 5000, 6000, 10);
		dao.insertOne(vo2);*/		
			
		// delete
		dao.deleteOne(99);
			
		// update
/*		EmpVO vo3 = new EmpVO(100,"Chris","SALESMAN",7822, 5000, 6000, 10);
		dao.updateOne(vo3);*/
			
			// ��������
//			dao.close();
	}	

}
