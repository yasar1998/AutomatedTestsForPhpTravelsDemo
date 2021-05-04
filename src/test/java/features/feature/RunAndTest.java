package features.feature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RunAndTest {
    public static void main(String[] args) {
        int WAIT_TIME = 10;

        AdminPage homePage;

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);

        homePage = new AdminPage(driver);
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/a")).click();
//        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[1]/a")).click();
//        homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]/form/button")).click();
//
//        homePage.getElement(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[3]/button")).click();
//        System.out.println(homePage.getElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());

        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[7]/a")).click();
        homePage.getElement(By.xpath("/html/body/div[3]/nav/div[2]/ul/li[7]/ul/li[1]/a")).click();

        driver.get(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
