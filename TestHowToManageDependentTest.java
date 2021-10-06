package uk.axone.testngbasics;

import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestHowToManageDependentTest {

    @Test
    public void launchWebSite(){
        System.out.println("Launching the website and naivation to the appln");
    }

    @Test(dependsOnMethods = {"launchWebSite"})
    public void loginApplication(){
        System.out.println("Logging into the appln");
    }


    @Test(dependsOnMethods = {"loginApplication"})
    public void addToCartTest(){
        System.out.println("Adding the products to the shopping cart");
        int x = 100;
        System.out.println(x / 0);
        System.out.println("end of add to shopping cart");
    }

    @Test(dependsOnMethods = {"addToCartTest"})
    public void checkoutTest(){
        System.out.println("Checkout test");
    }


}
