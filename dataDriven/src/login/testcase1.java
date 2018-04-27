package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class testcase1 {

	private static WebDriver driver = null;

public static void main(String[] args) throws Exception {


excel.setExcelFile(Constant.Path_TestData+"\\" + Constant.File_TestData,"Sheet1");

System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Softwares\\chromedriver.exe");

driver= new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get(Constant.URL);

String sUserName = excel.getCellData(1, 1);

String sPassword = excel.getCellData(1, 2);

        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(sUserName);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(sPassword);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

System.out.println("Excell data is working");



driver.quit();



}

}