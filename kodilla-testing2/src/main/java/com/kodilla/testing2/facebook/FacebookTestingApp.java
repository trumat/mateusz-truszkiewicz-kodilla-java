package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_DAY = "//div[contains(@id, \"u_0_p\")]/div[2]/span/span/select[1]";
    private static final String XPATH_MONTH = "//div[contains(@id, \"u_0_p\")]/div[2]/span/span/select[2]";
    private static final String XPATH_YEAR = "//div[contains(@id, \"u_0_p\")]/div[2]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_DAY)));
        selectDay.selectByValue("4");
        Select selectMonth = new Select(driver.findElement(By.xpath(XPATH_MONTH)));
        selectMonth.selectByValue("1");
        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_YEAR)));
        selectYear.selectByValue("1990");
    }
}
