package college;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Anbarasi {
	public static void main (String[]args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbuabhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjw4P6oBhBsEiwAKYVkq080hBLj_HOrNRcDY1ko7OT9LT0bglYMbV8_6ch8bOmxlKHGiR31NxoCXawQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\Anbuabhi\\Downloads\\file upload1.exe");
		
	}

}