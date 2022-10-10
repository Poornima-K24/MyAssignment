package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateLead 
	{

		public static void main(String[] args)
		{
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.edgedriver().setup();
			//EdgeDriver driver= new EdgeDriver();
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			WebElement elementUsername = driver.findElement(By.id("username"));
			elementUsername.sendKeys("Demosalesmanager");
			WebElement elementPassword = driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");
			WebElement elementSubmit = driver.findElement(By.className("decorativeSubmit"));
			elementSubmit.click();
			WebElement elementLink = driver.findElement(By.linkText("CRM/SFA"));
			elementLink.click();
			WebElement elementLead = driver.findElement(By.linkText("Leads"));
			elementLead.click();
			WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();
			WebElement elementCompanyname = driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyname.sendKeys("hcl");
			WebElement elementFirstname = driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstname.sendKeys("test");
			WebElement elementLastname = driver.findElement(By.id("createLeadForm_lastName"));
			elementLastname.sendKeys("one");
			WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
			elementFirstNameLocal.sendKeys("test");
			WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
			elementdepartmentName.sendKeys("IT");
			WebElement elementdescription = driver.findElement(By.id("createLeadForm_description"));
			elementdescription.sendKeys("test description");			
			WebElement elementemail = driver.findElement(By.id("createLeadForm_primaryEmail"));
			elementemail.sendKeys("test@gmail.com");		
			WebElement elementCreatelead = driver.findElement(By.className("smallSubmit"));
			elementCreatelead.click();
			
			String Tile=driver.getTitle();
			
			System.out.println("Tile name post the create lead-" + Tile);

			driver.close();
			
		}
	}


