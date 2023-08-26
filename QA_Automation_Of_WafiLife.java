package WAFILIFE.Automation_QA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class QA_Automation_Of_WafiLife extends Setup_Browser {
	private String browser;
	 public QA_Automation_Of_WafiLife(String browser) {
	        this.browser = browser;
	    }
	 @Test(priority = 1)
	 public void automation () throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.wafilife.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());}
		
	 @Test(priority = 2)
	    public void login() throws InterruptedException {
	    //WebElements
		
		//WebElement LoginRegistration = driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]"));
		//LoginRegistration.click();
		
		// Use WebDriverWait to wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed
        WebElement loginRegistration = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]")));

        // Click the element after it becomes clickable
        loginRegistration.click();
	 
        //LoginWithBlank
        
        WebElement LoginWithBlank = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[3]/input[3]")));
        LoginWithBlank.click();
        Thread.sleep(2000);    
        
        //Login with Invalid Credentials (Username & Password)
        
        WebElement useremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        useremail.clear();
        useremail.sendKeys("Amudasor@gmail.com");
      
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        password.clear();
        password.sendKeys("Ac@41230.");

        WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[3]/input[3]")));
        Login.click();
        Thread.sleep(2000);}
	 @Test(priority = 3)
	    public void forgotPassword() throws InterruptedException {
        //Forgot Password
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ForgotPassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'আপনি কি পাসওয়ার্ড ভুলে গেছেন?')]")));
        ForgotPassword.click();
        Thread.sleep(1000);
        
        WebElement ForgotPasswordUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_login']")));
        ForgotPasswordUser.sendKeys("amuda@gmail.com");
        Thread.sleep(1000);
        
        WebElement ForgotPasswordClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'পাসওয়ার্ড রিসেট করুন')]")));
        ForgotPasswordClick.click();
        Thread.sleep(1000);
        
        WebElement ForgotPasswordUserEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/form[1]/p[2]/input[1]")));
        ForgotPasswordUserEmail.sendKeys("amudassor@gmail.com");
        Thread.sleep(1000);
        
        WebElement ForgotPasswordClick0 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'পাসওয়ার্ড রিসেট করুন')]")));
        ForgotPasswordClick0.click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);}
	 @Test(priority = 4)
	    public void loginWithValidCredentials() throws InterruptedException {
        //Login with valid credentials (login & password)
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        user.clear();
        user.sendKeys("Amudasor@gmail.com");
      
        WebElement password0 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
        password0.clear();
        password0.sendKeys("Ac@41230.");

        WebElement Login0 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[3]/input[3]")));
        Login0.click();
        Thread.sleep(2000);
	    }
        
        //Author
	 @Test(priority = 5)
	    public void authorSection() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));   
	 WebElement Author = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/span[1]")));
        Author.click();
        Thread.sleep(1000);
        
        // Scroll down using JavaScript
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        // Scroll back to the top of the page
        jsExecutor.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(1000);
        // Scroll down using JavaScript
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        

        WebElement NextPage = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("→")));
        NextPage.click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        

        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
	 }
 
	 @Test(priority = 6)
	    public void Book() throws InterruptedException {  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  
        WebElement Book = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]")));
        Book.click();
        Thread.sleep(1000);
        
        WebElement Search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header_search']//input[@id='freeSearchBoxWeb']")));
        Search.sendKeys("বয়কট");
        
        WebElement SearchButton = driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/button[1]"));
        SearchButton.click();
        Thread.sleep(2000);
        
        //driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        //driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        

        
        WebElement BoyCot = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("বয়কট")));
        BoyCot.click();
        Thread.sleep(1000);}
	 @Test(priority = 7)
	    public void order() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        
        //একটু পড়ে দেখুন
        //WebElement ReadWhile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'একটু পড়ে দেখুন')]")));
        //ReadWhile.click();
        //Thread.sleep(2000);
        //Actions actions = new Actions(driver);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Thread.sleep(2000);
        
        WebElement Order = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[2]")));
        Order.click();
        Thread.sleep(2000);
        
        WebElement PopUpOrder = driver.findElement(By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]"));
        PopUpOrder.click();
       
        WebElement Cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[2]/a[1]")));
        Cart.click();
        Thread.sleep(2000);
        
        WebElement CartOrder = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[2]/div[1]/div[1]/p[2]/a[2]")));
        CartOrder.click();
        Thread.sleep(1000);}
        
        //OrderInfo
	 @Test(priority = 8)
	    public void orderInfo() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));    
	 WebElement Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='billing_first_name']")));
        Name.clear();
        Name.sendKeys("Mudassor Ahmed Chowdhury");
        Thread.sleep(1000);
        
        WebElement Number = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='billing_phone']")));
        Number.clear();
        Number.sendKeys("01311773124");
        Thread.sleep(1000);
        
        WebElement EmergencyNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='billing_alternative_phone']")));
        EmergencyNumber.clear();
        EmergencyNumber.sendKeys("01882347071");
        Thread.sleep(1000);
        
        WebElement OrderMail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='billing_email']")));
        OrderMail.clear();
        OrderMail.sendKeys("Amudassor@gmail.com");
        Thread.sleep(1000);
        
        //Order Info Drop Down
  
        //WebElement DistrictOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-billing_state-container")));
        //DistrictOption.click();
        //Select select = new Select(DistrictOption);
        //slectByIndex - Order Info Drop Down
      	//select.selectByIndex(13);
      	//Thread.sleep(1000);        
        
        
        

        
        
        
        
    }

}
