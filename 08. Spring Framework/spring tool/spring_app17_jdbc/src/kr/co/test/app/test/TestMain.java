package kr.co.test.app.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

import kr.co.test.app.dao.Dao;
import kr.co.test.app.vo.DeptVO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Dao dao = ac.getBean("dao",Dao.class);
		
		//selectAll
		/*ArrayList<DeptVO> list = dao.selectAll();
		
		for(DeptVO vo : list){
			System.out.println(vo.getDeptno()+" : "+vo.getDname()+" : "+vo.getLoc());
		}*/
		
		
		//selectOne
		/*DeptVO vo = dao.selectOne(10);
		System.out.println(vo.getDeptno()+" : "+vo.getDname()+" : "+vo.getLoc());*/
		
		//insertOne
		/*DeptVO vo = new DeptVO(97, "test", "test입니다"); 
		dao.insertOne(vo);*/
		
		//updateOne
		/*DeptVO vo = new DeptVO(97, "test", "update_test");
		dao.updateOne(vo);*/
		
		//deleteOne
		/*dao.deleteOne(97);*/
		
		
		/*ArrayList<DeptVO> list = dao.selectAll();
		
		for(DeptVO vo : list){
			System.out.println(vo.getDeptno()+" : "+vo.getDname()+" : "+vo.getLoc());
		}*/
		
	}
}
