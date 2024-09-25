package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryTest extends TestBase {


    @Test
    public void inventorytest1(){
        logbrowser();
        System.out.println("inventory test1");
    }
    @Test
    public void inventorytest2(){
        logbrowser();
        System.out.println("inventory test2");
    }
    @Test
    public void inventorytest3(){
        logbrowser();
        System.out.println("inventory test3");
    }
}
