package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {
	

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

		// Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click on the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Murali");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramaneegan");

		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Step2: Select-Create an Object
		Select dropdown = new Select(sourceElement);

		// Step3: Use the method to Select - 3 Methods
		// dropdown.selectByIndex(4);
		// dropdown.selectByVisibleText("Conference");
		dropdown.selectByValue("LEAD_DIRECTMAIL");
		
		WebElement sourceIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select (sourceIndustry);
		industry.selectByIndex(2);
		industry.selectByValue("IND_DISTRIBUTION");
		
		
		
		
		
		// Click on the Create lead button
		driver.findElement(By.name("submitButton")).click();
		
		//html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/form[1]/div/div[2]/table/tbody/tr[2]/td[2]/span
				String text= driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/form[1]/div/div[2]/table/tbody/tr[2]/td[2]/span")).getText();
				if (text.contains("Murali")) {
					System.out.println("Name Verfied");
				}
				
				driver.quit();

	
	}
	}

