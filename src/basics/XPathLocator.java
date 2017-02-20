package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seek.co.nz");
		driver.findElement(By.xpath("html/body/div[1]/div/div/header/section/div[1]/div/nav/a[1]")).click();
		
		driver.findElement(By.id("Email")).sendKeys("test.sonca@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div/button")).click();
		

	}

}
