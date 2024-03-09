package genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class readProperty {
	
	FileInputStream path;
	public String fetchProperty(String key) {
		
		try {
			path = new FileInputStream("./data/shopper.properties");
		} catch (FileNotFoundException e) {
			Reporter.log("path is right", true);
		}
		Properties pObj = new Properties();
		try {
			pObj.load(path);
		}catch (IOException e) {
			Reporter.log("path is worng", true);
		}
		String data = pObj.getProperty(key);
		return data;
		
	}
}
