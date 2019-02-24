package stepDefinition;

public class ConfigFileReader {

	
	String src="C:\\Users\\welcome\\Desktop\\New Workspace\\TestProject\\src\\extent-config.xml";
	
			
	public String getReportConfigPath(){
		
		
	 String reportConfigPath =src; // properties.getProperty("reportConfigPath");
	 
	 if(reportConfigPath!= null) 
		 return reportConfigPath;
	 else 
		 throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}
	
}
