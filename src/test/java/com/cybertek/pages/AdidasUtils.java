package com.cybertek.pages;

import com.cybertek.utilitis.BrowserUtils;
import com.cybertek.utilitis.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdidasUtils {
    public AdidasUtils() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement LaptopSection;

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement laptopModel;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCard;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homePageButton;

    @FindBy(xpath = "//a[.='Dell i7 8gb']")
    public WebElement laptopModel2;

    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cart;

    @FindBy(xpath = "//tbody//tr//td[.='Dell i7 8gb']//..//td[.='Delete']/a")
    public WebElement getLaptopModel2Delete;

    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeOrder;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public  WebElement city;

    @FindBy(id = "card")
    public WebElement card;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id ="year")
    public  WebElement year;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchase;




    public static void productAdder(WebDriver driver, String category, String product){
        WebElement laptopLocation = driver.findElement(By.xpath("//a[.='"+category+"']"));
        laptopLocation.click();
        BrowserUtils.sleep(1);
        WebElement i5Location= driver.findElement(By.xpath("//a[.='"+product+"']"));
        i5Location.click();
        BrowserUtils.sleep(1);
        WebElement addToCard = driver.findElement(By.xpath("//a[.='Add to cart']"));
        addToCard.click();
        BrowserUtils.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
    }
    public static void productRemover(WebDriver driver, String product){
        driver.findElement(By.xpath("//a[.='Cart']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']//..//td[.='Delete']/a")).click();
        BrowserUtils.sleep(3);
    }
}
