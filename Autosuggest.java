package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium loca");
		Thread.sleep(20);
		List<WebElement> options=driver.findElements(By.xpath("//li[@data-attrid=\"AutocompletePrediction\"]"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("selenium locators"))
			{
				option.click();
				break;
			}
		}
	}

}
