package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seek.co.nz");
		driver.findElement(By.xpath("html/body/div[1]/div/div/header/section/div[1]/div/nav/a[1]")).click();
		driver.findElement(By.id("Email")).sendKeys("test.sonca+1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div/button")).click();
	}
}