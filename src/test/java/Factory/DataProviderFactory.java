package Factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

public class DataProviderFactory {
 
	public static ConfigDataProvider getConfig()
	    {
	
		ConfigDataProvider config = new ConfigDataProvider();
		
		return config;
		}
	
	public static ExcelDataProvider getExccel()
	    {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		
		return excel;
		
    	}
	
	
}
