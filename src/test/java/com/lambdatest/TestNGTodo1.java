package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTodo1 {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
//        String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
//        String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");
//        ;
        String username="belalahmad";
        String authkey="cousQqH3syuMR3H55LiQfG4QqCyPHRsZs3XJ3mbEle94hOdYLj";
        String hub = "@hub.lambdatest.com/wd/hub";

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platform", "MacOS Catalina");
//        caps.setCapability("browserName", "Safari");
//        caps.setCapability("version", "latest");
//        caps.setCapability("build", "TestNG With Java");
//        caps.setCapability("name", m.getName() + " - " + this.getClass().getName());
//        caps.setCapability("plugin", "git-testng");
//
//        String[] Tags = new String[] { "Feature", "Falcon", "Severe" };
//
////        caps.setCapability("tags", Tags);
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browserName", "chrome");
//        caps.setCapability("platformName", "win10");
//        caps.setCapability("channelType", "stable");
//        caps.setCapability("build", "1577");
//        caps.setCapability("console", true);
//        caps.setCapability("enableDebugLogsInMartian", false);
//        caps.setCapability("EnableHTTP2InMartian", false);
//        caps.setCapability("enableNetworkThrottling", false);
//        caps.setCapability("enableSSEInMartian", false);
//        caps.setCapability("enableWSInMartian", false);
//        caps.setCapability("extendedDebugging", true);
//        caps.setCapability("headless", false);
//        caps.setCapability("idleTimeout", 270);
//
//        Map<String, String> loggingPrefs = new HashMap<>();
//        loggingPrefs.put("browser", "ALL");
//        caps.setCapability("loggingPrefs", loggingPrefs);
//
//        caps.setCapability("name", "PROD-A/orion-audience-prod-lt");
//        caps.setCapability("network", false);
//        caps.setCapability("performance", false);
//        caps.setCapability("resolution", "1600x1200");
//        caps.setCapability("timezone", "");
//        caps.setCapability("tunnel", false);
//        caps.setCapability("tunnelIdentifier", "");
//        //caps.setCapability("tunnelName", "MCHOYAL-VM-15");
//  //      caps.setCapability("userAgent", "selenium/3.14.0 (java unix)");
//        caps.setCapability("version", "127.0");
//        caps.setCapability("video", true);
//        caps.setCapability("visual", false);
//        caps.setCapability("w3c", true);
//
//
//        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);

    }

    @Test
    public void basicTest() {
        String spanText;
        System.out.println("Loading Url");
//        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Opening WebApp\", \"level\": \"info\"}}");

//        driver.get("https://lambdatest.github.io/sample-todo-app/");
        driver.get("https://gateway.on24.com/wcc/eh/3706492/lp/3707138/");







//        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Checking List Items\", \"level\": \"info\"}}");
//
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
//        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Adding Items\", \"level\": \"info\"}}");
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
//        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Checking More Items\", \"level\": \"info\"}}");
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
//        Thread.sleep(300);
//
//        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Adding and Verify List Items\", \"level\": \"info\"}}");
//        System.out.println("Entering Text");
//        driver.findElement(By.id("sampletodotext")).sendKeys("Get Taste of Lambda and Stick to It");
//
//        driver.findElement(By.id("addbutton")).click();
//
//        System.out.println("Checking Another Box");
//        driver.findElement(By.name("li9")).click();
//
//        // Let's also assert that the todo we added is present in the list.
//
//        spanText = driver.findElementByXPath("/html/body/div/div/div/ul/li[9]/span").getText();
//        Assert.assertEquals("Get Taste of Lambda and Stick to It", spanText);
//        Status = "passed";
//        Thread.sleep(150);
//
//        System.out.println("TestFinished");

    }

    @AfterMethod
    public void tearDown() {
//        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Adding Test Result and Closing Browser\", \"level\": \"info\"}}");
//        driver.executeScript("lambda-status=" + Status);
        driver.quit();
    }

}