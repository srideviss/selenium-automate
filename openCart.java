import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class openCart {
    public static void main(String[] args)  {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\srideviss\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, 10);;
        driver.get("https://www.opencart.com/index.php?route=account/login");
           driver.manage().window().maximize();
           WebElement userName=driver.findElement(By.id("input-email")) ;
           userName.sendKeys("nithipras23@gmail.com");
           WebElement passWord=driver.findElement(By.id("input-password"));
           passWord.sendKeys("Sridevi23");
           WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
           loginButton.click();
           WebElement pin=driver.findElement(By.id("input-pin"));
           pin.sendKeys("2307");
           WebElement continueButton= driver.findElement(By.xpath("//*[@id=\"account-security\"]/div[2]/div/div[1]/form/div[2]/button"));
           continueButton.click();
           WebElement demo= driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[2]/a"));
           demo.click();
           WebElement viewStoreFront=driver.findElement(By.className("box-overlay"));
           viewStoreFront.click();
           ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebElement searchBar= driver.findElement(By.name("search"));
        searchBar.sendKeys("iphone");
        WebElement searchButton=driver.findElement(By.name("search"));
        searchButton.sendKeys(Keys.ENTER);
        WebElement addToCart=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
        addToCart.click();
        WebElement cartButton=driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        cartButton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        WebElement CheckoutElement=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
        wait.until(ExpectedConditions.visibilityOf(CheckoutElement));
        CheckoutElement.click();

     }}
