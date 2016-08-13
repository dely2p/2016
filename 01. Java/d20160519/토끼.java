package d20160519;

public class Åä³¢ extends Æ÷À¯·ù{					// Æ÷À¯·ù Å¬·¡½º »ó¼Ó¹ŞÀ½
	private int ±Í;
	protected int ÀÌ»¡;
	public String Á¾;
	
	public Åä³¢(){								// »ı¼ºÀÚ
		±Í = 2;
		ÀÌ»¡ = 2;
		Á¾ = "¾Ó°í¶ó";   
	}	
	public void Á¡ÇÁ(){							// Á¡ÇÁ method
		System.out.println("±øÃÑ±øÃÑ~~~~");
	}
	@Override									// annotation
	public void ¸Ô±â(){							// ¸Ô±â method
		System.out.println("³È³È³È Ç®À» ¸ÀÀÖ°Ô ¸Ô¾î¿ä");
	}
	@Override									// annotation
	public void ÀÚ±â(){							// ÀÚ±â method
		System.out.println("ÄğÄğÄğ Åä³¢Áı¿¡¼­ Àá~~");
	}
}
