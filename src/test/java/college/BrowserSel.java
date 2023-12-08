package college;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserSel  {
	public static void main ( String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Anbuabhi\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\\\\" );
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
		List<WebElement>mobileName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(int i=0;i<mobileName.size();i++) {
		 WebElement names=mobileName.get(i);
		 String name=names.getText();
		 List<WebElement>mobilePrice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 for(int j=i;j<=i;j++) {
			 WebElement prices=mobilePrice.get(j);
			 String price=prices.getText();
			 Map<String,String>mp=new LinkedHashMap<>();
			 mp.put(name,price);
			 System.out.println(mp);
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		}
		
		
	   
	    	
	    }
	   
	    
		
		
	}			
	
	

	
	

	
	
	
