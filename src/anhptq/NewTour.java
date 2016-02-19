package anhptq;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTour {
//new tour
	public static void loginSucceed() throws InterruptedException {
		// Khoi tao web driver
		WebDriver driver = new FirefoxDriver();
		// Truy cap link website
		driver.get("http://newtours.demoaut.com/");
		// Lay webelement
		WebElement btnSignin = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		// Click button
		btnSignin.click();
		Thread.sleep(5000);
		WebElement txtUser = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
		//String user = txtUser.
		Assert.assertEquals("tutorial", txtUser.getText());
		WebElement txtPass = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		Assert.assertEquals("tutorial", txtPass.getText());
		
		WebElement btnSubmit = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		btnSubmit.click();
		Thread.sleep(5000);
		
		//WebElement str = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font"));
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		loginSucceed();
		}
}
