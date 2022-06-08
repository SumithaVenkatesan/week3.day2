package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
		
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).submit();
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);
		String count=driver.findElement(By.xpath("//div[@id='products']//div[@class='length']")).getText();
		System.out.println("Count of product: "+count);
		
		
	}

}
