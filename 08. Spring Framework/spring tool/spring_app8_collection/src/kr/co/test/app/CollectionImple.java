package kr.co.test.app;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionImple implements CollectionInter{

	private List<String> list;
	private Map<String,String> map;
	
	
	
	public CollectionImple() {
		super();
	}
	public CollectionImple(List<String> list, Map<String, String> map) {
		super();
		this.list = list;
		this.map = map;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	@Override
	public void printList() {
		for(String x : list){
			System.out.println(x);
		}
		System.out.println("-----------list end------------");
	}

	@Override
	public void printMap() {
		/*Set<String> key = map.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()){
			String x = it.next();
			System.out.println(x+" : "+map.get(x)); //value값
		}*/
		for(String key : map.keySet()){
			System.out.println(key+" : "+map.get(key)); //value값
		}
		System.out.println("-----------map end------------");
	}	
}
