package kr.co.test.app.web.control;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InfoController {

	@RequestMapping(value="info.nhn")
	public ModelAndView modelview(HttpServletRequest req){
		
/*		출력결과
		당신의 ip는 192.168.0.42입니다.
		오늘은 Monday
		현재 시간은 2016.08.29 :13:05:22 입니다.*/
		String print = "";
		String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; 
		Calendar cal = Calendar.getInstance();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");		
		/*String ip = req.getLocalAddr();*/
		InetAddress ip= null;
		try {
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		print += "당신의 ip는 "+ip.getHostAddress()+"입니다.\n";
		print += "오늘은 "+day[Calendar.DAY_OF_WEEK_IN_MONTH%7]+"\n";
		print += "현재시간은 "+sdf.format(d)+"입니다.";
		
		return new ModelAndView("info","msg",""+print);
		
	}
}
