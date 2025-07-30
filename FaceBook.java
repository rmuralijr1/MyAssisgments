package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/span/span")).click();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/span/span")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Murali");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ramaneegan");
		
		WebElement dateDropdown = driver.findElement(By.id("day"));
        Select date = new Select(dateDropdown);
        date.selectByValue("31");
        
        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropdown);
        month.selectByValue("8");
        
        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select year = new Select(yearDropdown);
        year.selectByValue("1983");
        
        WebElement Gender = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));Gender.click();
        
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rmuralijr@yahoo.co.in");
        
        driver.findElement(By.name("reg_passwd__")).sendKeys("testleaf123@");
        
        driver.quit();

	
	}

}
