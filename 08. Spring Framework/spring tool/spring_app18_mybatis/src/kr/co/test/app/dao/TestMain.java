package kr.co.test.app.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.test.app.vo.DeptVO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Dao d = ac.getBean("dao", Dao.class);
		
		List<DeptVO> list = d.selectAll();
		for(DeptVO vo : list){
			System.out.println(vo.getDeptno()+" : "+vo.getDname()+" : "+vo.getLoc());
		}
		System.out.println("---------------------------");
		DeptVO vo = d.selectOne(20);
		System.out.println(vo.getDeptno()+" : "+vo.getDname()+" : "+vo.getLoc());
	}
}
