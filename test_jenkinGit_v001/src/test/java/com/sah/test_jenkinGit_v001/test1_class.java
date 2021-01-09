package com.sah.test_jenkinGit_v001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1_class {
public static void main(String[] args) throws Exception
{
System.out.println("Joyguru");
WebDriver driver;
//System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
WebDriverManager.chromedriver().setup();

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://google.com");
//driver.wait(10000);

driver.quit();
System.out.println("================Automation done================");
}
}
