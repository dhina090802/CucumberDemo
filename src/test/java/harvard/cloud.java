package harvard;

import org.openqa.selenium.By;//using try cache(exception handle)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cloud {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();		
		ChromeDriver driver = new ChromeDriver();
		
		//2
		driver.findElement(By.name("password")).sendKeys("admin");

		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();


		Thread.sleep(7000);

		String act_title=driver.getTitle();
		String exp_title=" nopCommerce administration";

		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("failed");
		}

	}

}
