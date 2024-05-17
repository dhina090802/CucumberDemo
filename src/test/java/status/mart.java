package status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();


		//css with tag & id
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		driver.findElement(By.id("small-searchterms"));

		//tag class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		//tag & attribute
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("MacBook");
		
		//tag class & attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
	}

}


