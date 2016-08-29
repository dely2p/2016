package spring_app_app6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;



public class FireLog {
	public void doAspect(JoinPoint jp){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		String time = sdf.format(d);
		
		File f = new File("c:\\log\\fire_"+time+".log");
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println("총기사용 : "+ time);
			pw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
