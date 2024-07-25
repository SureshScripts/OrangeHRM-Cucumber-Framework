package StepsRunning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class PleaseRun {
	
 public static WebDriver driver;
 public static Robot R;
 
 
	@Given("Browser to be open")
	public void browseropen() {
		System.setProperty("Webdriver.Chrome.Driver", "D:\\java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	
	@Then("Enter appication URL")
	public void appicationURL() {
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");   
	}
	
	
	@When("Home page opened validate home page title")
	public void homepagetitle() {
		System.out.println("the Homepage title is : "+driver.getTitle());
	}
	
	
	@Then("Enter user name")
	public void username() {
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	}
	
	
	@Then("Enter password")
	public void password() {
		 driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	    
	}
	
	
	@Then("Hit on login button")
	public void loginbutton() {
		driver.findElement(By.name("Submit")).click(); 
	}
	
	
	@When("After login click on add button")
	public void afterlogin() throws InterruptedException {
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='rightMenu']")));
	    t(1);
	    driver.findElement(By.xpath("//input[@onclick='returnAdd();']")).click();
	}
	
	
	@Then("Clear the code and enter new code")
	public void code() {
		driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).clear();
		driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).sendKeys("1122");   
	}
	
	
	@Then("Enter last name")
	public void lastname() {
	    driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("bunny");    
	}
	
	
	@Then("Enter first name")
	public void firstname() {
	  driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("surya");   
	}
	
	
	@Then("Enter middle name")
	public void middlename() {
		 driver.findElement(By.xpath("//input[@id='txtEmpMiddleName']")).sendKeys("surya");     
	}
	
	
	@Then("Enter nick name")
	public void nickname() {
	    
		driver.findElement(By.xpath("//input[@id='txtEmpNickName']")).sendKeys("surya"); 
	}
	
	
	@Then("Click on photo choose file")
	public void photo() throws InterruptedException {
		Actions A = new Actions(driver);
		t(2);
		A.moveToElement(driver.findElement(By.xpath("//input[@name='photofile']"))).click().perform();   
	} 
	
	
	@When("After navigated to files select employee photo")
	public void selectphoto() throws AWTException, InterruptedException {
		t(2);
		StringSelection SS = new StringSelection("C:\\Users\\ADMIN\\Pictures\\Screenshots\\Screenshot (3).png");
	    
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, SS);
		t(2);
		R = new Robot();
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
	    R.keyRelease(KeyEvent.VK_V);
	    t(1);
	}
	
	
	@Then("Click on enter")
	public void enter() {
		  R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);  
	}
	

	@Then("Click on save button")
	public void savebutton() throws InterruptedException {
		t(2);
	  driver.findElement(By.xpath("//input[@title='Save']")).click();    
	}
	
	
	
	public void t (int d) throws InterruptedException {
		int x = d*1000;
		Thread.sleep(x);
	}
}
