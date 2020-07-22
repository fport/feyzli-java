package uygulama5Properties;

import java.util.Properties;

public class uygulama5 {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		
		properties.setProperty("adi", "furkan");
		properties.setProperty("soyadi", "portakal");
		
		String adi = (String) properties.get("adi");
		System.out.println(adi);
		System.out.println(properties);
	}
}
