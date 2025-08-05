package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AltexTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Schimbă calea cu path-ul corect către chromedriver-ul tău
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\SeleniumTestAutomation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://altex.ro");
    }

    @Test(priority = 1)
    public void testHomepageAccess() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://altex.ro/", "URL-ul paginii principale nu corespunde");
    }

    @Test(priority = 2)
    public void testTitleContainsAltex() {
        String title = driver.getTitle();
        Assert.assertTrue(title.toLowerCase().contains("altex"), "Titlul paginii nu conține 'Altex'");
    }

    @Test(priority = 3)
    public void testSearchButtonVisibility() {
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        Assert.assertTrue(searchButton.isDisplayed() && searchButton.isEnabled(), "Butonul 'Caută' nu este vizibil sau activ");
    }

    @Test(priority = 4)
    public void testContactPageAccess() {
        WebElement contactLink = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
        contactLink.click();

        // Aștept puțin să se încarce pagina (ideal cu WebDriverWait în producție)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String contactUrl = driver.getCurrentUrl();
        Assert.assertTrue(contactUrl.contains("contact"), "Nu s-a încărcat pagina de Contact");
    }

    @Test(priority = 5)
    public void testProductSearch() {
        driver.get("https://altex.ro");
        WebElement searchInput = driver.findElement(By.name("searchTerm"));
        searchInput.sendKeys("laptop");

        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        // Aștept puțin să se încarce rezultatele
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String pageSource = driver.getPageSource().toLowerCase();
        Assert.assertTrue(pageSource.contains("laptop"), "Pagina de rezultate nu conține termenul 'laptop'");
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

