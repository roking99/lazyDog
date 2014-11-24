package cn.lazyDog.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	private static ReadProperties instance=null; 
	
	private Properties properties;
	
	private ReadProperties(){
		
		
		
	}
	
	public synchronized  static ReadProperties getInstance()
	{
		if(instance==null)
			instance=new ReadProperties();
		return instance;
	}
	
	public Properties getProperties(String strPath)
	{
		properties=new Properties();
		try {
			
			FileInputStream fis=new FileInputStream(strPath);
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
		
	}
	
	public String getValue(String key)
	{
		if(properties.containsKey(key))
		{
			String value=properties.getProperty(key);
			return value;
		}
		return null;
	}
	
	public static void main(String[]args)
	{
//		HttpServletRequest request=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
//		String str=request.getRealPath("/WEB-INF/conf/report.properties");
//		System.out.println(str);
		ReadProperties rp=ReadProperties.getInstance();
		rp.getProperties("E:\\ProjectWorkspace\\.metadata\\.plugins\\com.apusic.studio.dev\\lydl\\.explodedEar\\web.war\\WEB-INF\\conf\\report.properties");
		System.out.println(rp.getValue("report.iportalUrl"));
		
	}
	

}
