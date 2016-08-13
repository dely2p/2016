package d20160525;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();		// ArrayList »ý¼º
		
		al.add("µþ±â");				// ArrayList¿¡ Ãß°¡
		al.add("¹Ù³ª³ª");
		al.add("¼ö¹Ú");
		al.add("¸Á°í");
		al.add("¸Á°í");
		al.add("¸Á°í");
		al.add("¸Á°í");
		al.add("¸Á°í");
		al.add("¸Á°í");
		al.add("¸Á°í");
		al.add("¸Á°í");
		al.add("¸Á°í");
		System.out.println("ArrayList : "+al);
		
		
		for(int i=0;i<al.size();i++){		// ArrayList °ªµé Ãâ·Â
			System.out.println(al.get(i));
		}
	}
}
