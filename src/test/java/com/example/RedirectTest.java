package com.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectTest extends BaseClass {

    @Test
    public void testRedirect() {
        // Navigate to the specified URL
        driver.get("https://dtsqa.mox2.net.in");

        // Verify the page title or other elements
        String expectedTitle = "Expected Page Title"; // Replace with the actual expected title
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
    }
}