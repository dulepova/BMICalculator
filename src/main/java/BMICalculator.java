import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 *
 */
public class BMICalculator {
    @Test
    public void calcTest() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("47");
        $(By.name("ht")).sendKeys("158");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public void calcTest1() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("63");
        $(By.name("ht")).sendKeys("158");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Overweight");
    }
    @Test
    public void calcTest2() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("75");
        $(By.name("ht")).sendKeys("158");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Obese");
    }
    @Test
    public void calcTest3() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("46");
        $(By.name("ht")).sendKeys("158");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Underweight");
    }
    @Test
    public void calcTest4() {
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("37");
        $(By.name("ht")).sendKeys("158");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Starvation");
    }


}
