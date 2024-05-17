package harvard;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class level {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver drive = new ChromeDriver();		
ChromeDriver driver = new ChromeDriver();
 // intimating the driver for get the chrome
//ChromeDriver drive = new ChromeDriver(); // exactly for chrome
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize(); 
Thread.sleep(5000);
//1.
WebElement txtUsername=driver.findElement(By.name("username"));
txtUsername.clear();
txtUsername.sendKeys("Admin");

//2
driver.findElement(By.name("password")).sendKeys("admin123");

driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();


Thread.sleep(7000);

String act_title=driver.getTitle();
String exp_title="OrangeHRM";

if(act_title.equals(exp_title))
{
	System.out.println("Test passed");
}
else
{
	System.out.println("failed");
}

/*String act_label = "";
try
{
act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
}
catch(NoSuchElementException e)	{ 
	}

String exp_label="Dashboard";

if(act_label.equals(exp_label))
{
	System.out.println("test passed");
}
else
{
	System.out.println("test failed");
*/
driver.quit();

}

	}


