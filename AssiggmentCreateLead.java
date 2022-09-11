package weel2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssiggmentCreateLead {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.className("x-panel-header-text")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Harness");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishwakala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kalaiselvan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sowmiya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SoftwareTestingEngineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("HappyLearning");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vishwakala97@gmail.com");
	    WebElement drobdown=	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dd= new Select(drobdown);
        dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Page title is : " + driver.getTitle());
		driver.close();
        
	}

}
