package com.app;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppTest {
    /**
     * Rigorous Test :-)
     */
    IOSDriver driver;
    String mHost="http://127.0.0.1:4723";
    @BeforeClass
    public void setup() throws MalformedURLException {
        System.out.println("<<<<<<<<<<< try to setup >>>>>>>>>>>>>>>>>>>>>");
        DesiredCapabilities iosCapabilities = new DesiredCapabilities();
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        iosCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        iosCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TestiPhoneX");
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
        iosCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/apps/TestApp-iphonesimulator.app");
        driver= new IOSDriver(new URL(mHost), iosCapabilities);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set iosCapabilities Done >>>>>>>>>>>>>>>>>>>>");

    }
    @Test
    public void testLogin(){
        System.out.println("<<<<<<<<<<< Login test pass >>>>>>>>>>>>>>>>>>>>>");
    }

    @AfterClass
    public void closeSession(){
        System.out.println("<<<<<<<<<<< Session close >>>>>>>>>>>>>>>>>>>>>");
        if(driver!=null){
            driver.quit();
        }
    }
}
