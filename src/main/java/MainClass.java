import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class MainClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        /*driver.get("https://google.com/");
        driver.navigate().to("https://selenium.dev/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());*/

        driver.get("https://en.wikipedia.org");

        WebElement link = driver.findElement(By.linkText("Wikipedia"));
        WebElement link2 = driver.findElement(By.partialLinkText("Ken"));
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("vector-search-box-input"));
        WebElement li = driver.findElement(By.id("ca-viewsource"));
        driver.findElement(By.cssSelector(""));

        driver.quit();
    }
}
