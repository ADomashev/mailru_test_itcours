package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyProvider {
	private Properties properties;

	public PropertyProvider(String fileName) {
		super();
		this.properties = setPropertiesFile(fileName);
	}

	private Properties setPropertiesFile(String fileName) {
		Properties result = new Properties();
		try (InputStream input = new FileInputStream(fileName)) {
			result.load(input);
		} catch (FileNotFoundException e) {
			System.out.println("File "+fileName +" not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Problem with input stream: ");
			e.printStackTrace();
		}

		return result;
	}
	
	public String getProperty(String propertyName) {
		return properties.getProperty(propertyName);
	}

}
