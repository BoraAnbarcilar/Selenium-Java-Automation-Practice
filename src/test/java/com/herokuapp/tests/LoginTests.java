package com.herokuapp.tests;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginTests {

    protected WebDriver driver;
    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        System.out.println("The site was successfully accessed.");

    }
    @Test
    @DisplayName("TC001 - Successfull Login (Positive)")
    public void HappyTest(){
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String actualMessage = driver.findElement(By.id("flash")).getText();
        String expectedMessage = "You logged into a secure area!";

        Assertions.assertTrue(actualMessage.contains(expectedMessage),"Expected message to contain: [" + expectedMessage + "] but got: [" + actualMessage + "]");
        System.out.println("Successfully logged in");

    }
    @Test
    @DisplayName("TC002 - Invalid Login (Negative)")
    public void negativeTest(){
        driver.findElement(By.name("username")).sendKeys("valid_user");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String actualMessage = driver.findElement(By.id("flash")).getText();
        String expectedMessage = "You logged into a secure area!";

        Assertions.assertTrue(actualMessage.contains(expectedMessage), "Expected message to contain: [" + expectedMessage + "] but got: [" + actualMessage + "]");
        System.out.println("The system gave the correct message: login failed.");
    }
    @AfterEach
    public void tearDown(){
        if (driver!=null){
            driver.quit();
            System.out.println("Browser closed successfully");
        }
    }

}
