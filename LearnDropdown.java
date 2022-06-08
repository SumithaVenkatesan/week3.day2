package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Classroom Activity
1) Launch chrome and go to http://www.leafground.com/pages/Link.html
2) Get all the links (using findElements)
3) Click on the first link (using get method with index as 0)
4) Print the title
5) Navigate back on the browser (driver.navigate().back())
6) Get all the links again (using findElements)
7) Print the count of the links (size)*/

public class LearnDropdown {
	
	public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		
		//System.out.println(allLinks.size());
		
		
		
			WebElement firstLink=allLinks.get(2);
			
			firstLink.click();
			
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			List<WebElement> allLinks1=driver.findElements(By.tagName("a"));
			
			System.out.println(allLinks1.size());
			
			String href=allLinks1.get(1).getAttribute("href");
			
		
		
	}

}
