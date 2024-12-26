package org.testing.basics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex01_TestSelenium {
    @Description("Launch the application")
    @Test
    public void test_selenium01(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }

}
