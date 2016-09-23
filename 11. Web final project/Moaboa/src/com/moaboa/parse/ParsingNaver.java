package com.moaboa.parse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.moaboa.dao.WebToonDAO;
import com.moaboa.dto.WebToonDTO;



public class ParsingNaver {
	
	public Document getDocument(String url){
		// Web Page�쓽 Document 媛앹껜瑜� 諛섑솚�븯�뒗 Method
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
	
	public Elements getWebToonElements(Document doc){
		// �빐�떦 Document 媛앹껜 �궡�쓽 �쎒�댆 Elements 媛앹껜瑜� 諛섑솚�븯�뒗 Method
		return doc.select("ul.img_list dl dt a");
	}
	
	public String getTitle(Element webToon){
		// �쎒�댆�쓽 �젣紐⑹쓣 �뼸�뼱�궡�뒗 Method
		return webToon.toString().split("title=\"")[1].split("\">")[0];
	}
	
	public String getURL(Element el){
		// Elements 媛앹껜�뿉 ���븳 �븯�씠�띁留곹겕瑜� 諛섑솚�븯�뒗 Method
		return "http://comic.naver.com/" + el.attr("href");
	}
	
	public String getRecentlyToon(Document doc){
		// �빐�떦 �쎒�댆�쓽 理쒖떊�솕 �닔瑜� 異붿텧�븯�뒗 Method
		Element el = doc.select("td.title a").get(0);
		String detailUrl = getURL(el);
		String recentlyToon = detailUrl.split("no=")[1].split("&")[0];
		return recentlyToon;
	}
	
	public String getWImage(Element webToon){
		return webToon.parent().parent().parent().select("div.thumb img").attr("src");
	}
	
	public static void main(String[] args) {
		String[] week = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
		String url = "http://comic.naver.com/webtoon/weekdayList.nhn?week=" + week[6];
		ParsingNaver naverToon = new ParsingNaver();

		// Naver WebToon Page�뿉 ���븳 Document 媛앹껜瑜� 諛섑솚諛쏄퀬 洹� 媛앹껜瑜� �씠�슜�븯�뿬 �빐�떦 �슂�씪�쓽 �쎒�댆 由ъ뒪�듃瑜� 諛섑솚 諛쏆쓬
		Elements webToonList = naverToon.getWebToonElements(naverToon.getDocument(url));
		WebToonDTO dto;
		WebToonDAO dao = new WebToonDAO();
		int webToonCount = 0;
		// 諛섑솚 諛쏆� 媛� �쎒�댆�뿉 ���븳 title, titleId, 理쒓렐 �솕 ���옣, ���몴 �씠誘몄�, 媛� �솕�쓽 �뜽�꽕�씪 url
		for(Element webToon : webToonList){
			String wName =  naverToon.getTitle(webToon);
			int titleId = Integer.parseInt(naverToon.getURL(webToon).split("titleId=")[1].split("&weekday")[0]);
			int recentlyNo = Integer.parseInt(naverToon.getRecentlyToon(naverToon.getDocument(naverToon.getURL(webToon))));
			String webSite = "naver";
			String wImage = naverToon.getWImage(webToon);
			String wGenre = "";
			String imageUrl = wImage;
			String contentUrl = "http://comic.naver.com/webtoon/detail.nhn?titleId=" + titleId + "&no=" + recentlyNo;
/*			dto = new WebToonDTO(wName, wImage, webSite, recentlyNo, wGenre, imageUrl, contentUrl, week[0], titleId);
			dao.insertOne(dto);*/
			
			System.out.println("INSERT INTO webtoon(wname, wimage, titleid, website, recentlyno, wgenre, imageurl, contenturl, week)");
			System.out.println("VALUES('" + wName + "', '" + wImage + "', " + titleId + ", '" + webSite + "', " + recentlyNo + ", '�옣瑜�', '" + imageUrl +  "', '" + contentUrl + "', '" + week[6] + "');");
			System.out.println();
		}	
	}
	

}
