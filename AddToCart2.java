package AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart2 {
	@Test
	public void addTocart() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\thagaram.sathwika\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.amazon.com/.");
     System.out.println("The Title is : "+ driver.getTitle());
     driver.manage().window().maximize();
     
     driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("SAMSUNG Galaxy S22 Ultra Cell Phone, Factory Unlocked Android Smartphone, 256GB, 8K Camera & Video, Brightest Display Screen, S Pen, Long Battery Life, Fast 4nm");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("Thread.sleep(3000);\r\n"
     		+ "     driver.findElement(By.xpath(\"//*[@id=\\\"add-to-cart-button\\\"]\")).click();\r\n"
     		+ "    ")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
     
    
     driver.close();
     
}
}


