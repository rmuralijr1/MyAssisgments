package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	private static final String Webelment = null;

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
 
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Murali Automation Tester");
		
		WebElement IndustryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(IndustryDropdown);
		industry.selectByIndex(3);
		
		WebElement OwnershipDropdown= driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select (OwnershipDropdown);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement SourceDropdown = driver.findElement(By.id("dataSourceId"));
		Select Source = new Select (SourceDropdown);
		Source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement MarketingCampaignDropdown = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select (MarketingCampaignDropdown);
		marketing.selectByIndex(6);
		
		WebElement StateProvinceDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateProvince = new Select(StateProvinceDropdown);
		stateProvince.selectByValue("TX");

		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		String Text = driver.findElement(By.xpath("//span[contains(@class,'tabletext']")).getText();
		
		if (Text.contains("Murali Automation Tester"));{
			System.out.println("Account Name Created Right");
		}
		
		
		
		
		
		

	}

}
