package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class QAConcortPage {

    WebDriver driver;

    public QAConcortPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

    @FindBy(id = "UserName")
    public WebElement usernameKutusu;

    @FindBy(id = "Password")
    public WebElement passwordKutusu;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    public void ConcortHotelLogin() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage = new QAConcortPage();
        Thread.sleep(2000);
        qaConcortPage.ilkLoginLinki.click();
        qaConcortPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHQAValidUsername"));
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword"));
        Thread.sleep(1000);
        qaConcortPage.loginButonu.click();
    }

//US0010 test locatorleri
    @FindBy (xpath = "(//a[@class='nav-link'])[2]")
    public WebElement AnaSayfaRoomsSecenegi;

    public void ConcortHotelRoomsGiris() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage = new QAConcortPage();
        Thread.sleep(1000);
        qaConcortPage.AnaSayfaRoomsSecenegi.click();
      Thread.sleep(7000);
    }
    //Rooms sayfasi

    @FindBy (xpath = "//h1[text()='Rooms']")
    public WebElement roomsSayfasiRoomsBasligi;

    @FindBy (id = "checkin_date")
    public WebElement advancedSearchBasligiCheckinDateBox;

    @FindBy (id = "checkout_date")
    public WebElement advancedSearchBasligiCheckoutDateBox;

    @FindBy (id = "IDRoomType")
    public WebElement selectRoomTypeDropdown;

    @FindBy (id = "AdultCount")
    public WebElement selectAdultCountDropdown;

    @FindBy (id = "ChildrenCount")
    public WebElement childrenDropdown;

    @FindBy (id = "location")
    public WebElement locationTextBox;

    @FindBy (xpath = "(//div[@class='form-group'])[7]")
    public WebElement searchButton;

    @FindBy (linkText = "Book Now ")
    public WebElement bookNow;

}
