package Intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.errorprone.annotations.FormatString;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Ajit");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("jagtap");
		driver.findElement(By.xpath("//div/span/label[@for=\"chkboxOne\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"chkboxTwo\"]")).click();
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class=\"error\"]")).getText());
		driver.findElement(By.xpath("//div/a[text()=\"Forgot your password?\"]")).click();
		driver.findElement(By.xpath("//div/form/input[@placeholder=\"Name\"]")).sendKeys("Raj");
		driver.findElement(By.xpath("//div/form/input[@placeholder=\"Email\"]")).sendKeys("raj@capgemini.com");
		driver.findElement(By.xpath("//div/form/input[@placeholder=\"Phone Number\"]")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText());
		String password = driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText();
		String[] pass = password.split("'");
		System.out.println(pass[1]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(pass[1]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()=\"You are successfully logged in.\"]")).getText());
		driver.findElement(By.className("logout-btn")).click();
		// driver.close();
	}

}
