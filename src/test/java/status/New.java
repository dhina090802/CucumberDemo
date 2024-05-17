package status;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.findElement(By.className("gLFyf")).sendKeys("Gmail"+Keys.ENTER);
driver.findElement(By.linkText("Sign in to Gmail")).click();
driver.findElement(By.linkText("SIGN IN TO GMAIL")).click();
WebElement txtUsername=driver.findElement(By.id("identifierId"));
txtUsername.sendKeys("dhina090801@gmail.com");

}
}