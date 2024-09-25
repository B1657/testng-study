package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PurchaseTest extends TestBase {


        @Test
        public void purchasetest1(){
            logbrowser();
            super.log(Status.INFO,"Verification done");
            System.out.println("purchase test1");
        }
        @Test
        public void purchasetest2(){
            logbrowser();
            System.out.println("purchase test2");
        }
        @Test
        public void purchasetest3(){
            logbrowser();
            System.out.println("purchase test3");
            Assert.fail("some verification failed");
        }
    }

