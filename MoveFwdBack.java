package Intro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoveFwdBack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		// driver.findElement(By.partialLinkText("Free Access to")).click();
		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().back();
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(drop);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println(driver.findElement(By.xpath("//input[@value=\"radio1\"]")).isSelected());
		driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value=\"radio1\"]")).isSelected());
		driver.findElement(By.name("checkBoxOption3")).click();
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("Ind");

		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/div"));
        
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}

		}

		driver.findElement(By.id("name")).sendKeys("ajit");
		driver.findElement(By.id("alertbtn")).click();
		Alert a = driver.switchTo().alert();
		String amsg = driver.switchTo().alert().getText();
		System.out.println(amsg);
		a.accept();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("raj");
		driver.findElement(By.id("confirmbtn")).click();
		Alert b = driver.switchTo().alert();
		String bmsg = driver.switchTo().alert().getText();
		System.out.println(bmsg);
		a.dismiss();
		
		/*Actions vip= new Actions(driver);
		vip.moveToElement(driver.findElement(By.xpath("//div[@class=\"tableFixHead\"]"))).build().perform();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}*/
	}

}
