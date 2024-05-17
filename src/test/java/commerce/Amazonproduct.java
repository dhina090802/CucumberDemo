package commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.findElement(By.linkText("Sign in")).click(); //1
		    driver.findElement(By.cssSelector("input#ap_email")).sendKeys("dhina090801@gmail.com"+Keys.ENTER);
		    driver.findElement(By.cssSelector("input#ap_password")).sendKeys("Dhina005");
		    driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		    driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("watch"+Keys.ENTER);
		    
	}

}
