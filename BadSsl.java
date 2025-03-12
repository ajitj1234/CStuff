package Intro;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BadSsl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//ChromeOptions options = new ChromeOptions();
		//HashMap<String, Object> prefs = new HashMap<String, Object>();
		//prefs.put("download directory", "path");
		//options.setExperimentalOption("prefs", prefs);
		//options.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//System.out.println(driver.getTitle());
		
		//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\ajijagta\\Screenshots.png"));
		
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1] | (//tr/td[2])"));
		//Collections.sort((List<T>) list);
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
					
			
		}*/
		System.out.println(list.stream());
			
	}

}
