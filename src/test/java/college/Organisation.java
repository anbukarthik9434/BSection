package college;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Organisation {
	public static void main(String[]args) throws Throwable{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Anbuabhi\\Downloads\\edgedriver_win64\\msedgedriver.exe\\");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html\\");
		driver.manage().window().maximize();
		List<WebElement> iTable=driver.findElements(By.tagName("table"));
		for(int i =0;i<iTable.size();i++);
		WebElement table= iTable.get(i);
		
		
		
		
		
}
}	

