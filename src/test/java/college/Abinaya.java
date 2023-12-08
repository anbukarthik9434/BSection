package college;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abinaya {
	public static void main(String[]args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anbuabhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement>iTable = driver.findElements(By.tagName("table"));
		for(int i=0;i<iTable.size();i++) {
			WebElement table = iTable.get(i);
			WebElement tBody = table.findElement(By.tagName("tbody"));
			List<WebElement> iRow= tBody.findElements(By.tagName("tr"));
			for(int j=0;j<iRow.size();j++) {
				WebElement row = iRow.get(j);
				List<WebElement> iData=row.findElements(By.tagName("td"));
				for(int k =0; k<iData.size();k++) {
					WebElement data = iData.get(k);
					String text = data. getText();
					System.out.println(text);
					if(text.equals("Canada")) {
						System.out.println("Required text is didplayed: "+text);
						System.out.println(text+"Row No: "+j);
						System.out.println(text+"Column No:"+k);
					}
					
					
				}				
			}					
		}				
			
	}			
	}	
				
			
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	