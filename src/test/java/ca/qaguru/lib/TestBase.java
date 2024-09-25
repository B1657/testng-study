package ca.qaguru.lib;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;
@Listeners(ExtentITestListenerClassAdapter.class)
public class TestBase {
    protected String browser;
        @BeforeMethod
        protected void beforeMethod(){
            System.out.println("Before Method");
        }
        @AfterMethod
        protected void afterMethod(){
            System.out.println("after Method");
        }
        @Parameters({"browser"})
        @BeforeClass
        protected void beforeClass(String browser){
            System.out.println("Before class  " +browser);
            this.browser=browser;
        }
        @AfterClass
        protected void afterClass(){
            System.out.println("after class");
        }

        @BeforeTest
        protected void beforeTest(){
            System.out.println("before test:");
        }
        @AfterTest
        protected void afterTest(){
             System.out.println("after test");
    }
    @BeforeSuite
    protected void beforeSuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    protected void afterSuite(){
        System.out.println("after suite");
    }
    protected void log(Status status, String msg){
        ExtentTestManager.getTest().log(status,msg);
    }
    protected void logbrowser(){
            log(Status.INFO,"launching the browser " +this.browser);
    }

}

