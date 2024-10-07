package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTodo2 {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
//        String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
//        String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");
        String username="belalahmad";
        String authkey="cousQqH3syuMR3H55LiQfG4QqCyPHRsZs3XJ3mbEle94hOdYLj";
        
        /*
        Steps to run Smart UI project (https://beta-smartui.lambdatest.com/)
        Step - 1 : Change the hub URL to @beta-smartui-hub.lambdatest.com/wd/hub
        Step - 2 : Add "smartUI.project": "<Project Name>" as a capability above
        Step - 3 : Add "((JavascriptExecutor) driver).executeScript("smartui.takeScreenshot");" code wherever you need to take a screenshot
        Note: for additional capabilities navigate to https://www.lambdatest.com/support/docs/test-settings-options/
        */

        String hub = "@hub.lambdatest.com/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("browserName", "chrome");
        caps.setCapability("version", "latest");
        caps.setCapability("build", "TestNG With Java");
        caps.setCapability("name", m.getName() + this.getClass().getName());
        caps.setCapability("plugin", "git-testng");
//        caps.setCapability("fixedIP","10.100.53.52"); //Not play
        caps.setCapability("fixedIP","10.100.52.134");



        String[] Tags = new String[] { "Feature", "Magicleap", "Severe" };
        caps.setCapability("tags", Tags);

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
    }

    @Test
    public void basicTest() throws InterruptedException {
        String spanText;
        System.out.println("Loading Url");

        driver.get("https://gateway.on24.com/wcc/eh/3706492/lp/3707138/");
        Thread.sleep(2000);
        driver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe#vjs_video_3_youtube_api")));
        Thread.sleep(2000);

        // Switch to the iframe containing the YouTube video
        driver.switchTo().frame(iframeElement);

        // Locate the YouTube play button and click it
        WebElement playButton = driver.findElement(By.cssSelector("button.ytp-large-play-button"));
        playButton.click();
        Thread.sleep(5000);

        // Additional actions or verification code here

        // Switch back to the main content if needed
        driver.switchTo().defaultContent();






//        System.out.println("Checking Box");
//        driver.findElement(By.name("li1")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li2")).click();
//
//        System.out.println("Checking Box");
//        driver.findElement(By.name("li3")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li4")).click();
//
//        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 6");
//        driver.findElement(By.id("addbutton")).click();
//
//        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 7");
//        driver.findElement(By.id("addbutton")).click();
//
//        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 8");
//        driver.findElement(By.id("addbutton")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li1")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li3")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li7")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li8")).click();
//
//        System.out.println("Entering Text");
//        driver.findElement(By.id("sampletodotext")).sendKeys("Get Taste of Lambda and Stick to It");
//
//        driver.findElement(By.id("addbutton")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li9")).click();

        // Let's also assert that the todo we added is present in the list.

//        spanText = driver.findElementByXPath("/html/body/div/div/div/ul/li[9]/span").getText();
//        Assert.assertEquals("Get Taste of Lambda and Stick to It", spanText);
        Status = "passed";
        Thread.sleep(150);

        System.out.println("TestFinished");

    }

    @AfterMethod
    public void tearDown() {
        driver.executeScript("lambda-status=" + Status);
        driver.quit();
    }

}