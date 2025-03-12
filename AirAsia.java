package Intro;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirAsia {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("123");
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveByOffset(100, 100).click().build().perform();
		driver.findElement(By.xpath("//li[@data-cy=\"roundTrip\"]")).click();
		List<WebElement> options = driver.findElements(By.xpath("//span[@class=\"tabsCircle appendRight5\"]"));
		//System.out.println(options.size());

		/*
		 * for(int i =0;i<options.size();i++) {
		 * 
		 * String text = options.get(i).getText();
		 * System.out.println(text); }
		 */
		Thread.sleep(1000);
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Round Trip")) {
				option.click();

			}
		}
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("mum");
		//WebElement ele = driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]"));
		//ele.click();
		//Thread.sleep(1000);
		//ele.sendKeys("mum");
		//Thread.sleep(1000);
		//WebElement raj = driver.findElement(By.xpath("//p[text()=\"Musoma, Tanzania\"]"));
		//Actions a= new Actions(driver);
		//a.moveToElement(raj).click().build().perform();
		
		//List<WebElement> mums = driver.findElements(By.xpath("//li[@class=\"react-autosuggest__suggestion\"]/div/div/div/div/div/p"));
		//System.out.println(mums.size());
		//Thread.sleep(1000);
		//for(int i=0;i<mums.size();i++)
		//{
		//	System.out.println(mums.get(i).getText());
			
		//}
		
		/*for(WebElement mum:mums)
		{
			//Thread.sleep(2000);
			
			if(mum.getText().equalsIgnoreCase("Musoma"));
			{
				
				//Thread.sleep(2000);
				//Actions a= new Actions(driver);
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				//wait.until(ExpectedConditions.visibilityOf(mum));
				//a.scrollToElement(mum).click().build().perform();
				//a.moveToElement(mum).click().build().perform();
				
			    
				
								
				//mum.click();
				
			
		}
		
		//System.out.println(mums.size());
		
		//Select s=new Select(mum);
		//s.getFirstSelectedOption().
		 	
		}*/
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@data-cy=\"departureDate\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[text()=\"5\"])[1]")).click();
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[text()=\"Return\"]")).click();
		//Thread.sleep(5000);
		//WebElement date = driver.findElement(By.xpath("((//p[text()=\"6\"])[2]"));
		//driver.findElement(By.xpath("(//span[text()=\"2025\"])[2]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("((//p[text()=\"6\"])[2]")).click();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.visibilityOf(date));
		//date.click();
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("((//p[text()=\"6\"])[2]")));
		a.click();
	}
	
}
