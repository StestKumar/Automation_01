import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {
    protected static WebDriver driver;

    static String Expectedmsg = "Your message has been sent";

    @BeforeMethod
    public static void openBrowswe() {
        driver = new ChromeDriver();
        //Type URL
        driver.get("https://demo.nopcommerce.com/");
    }

    public static void findByElement(By by) {
        driver.findElement(by).click();
    }

    public static void findText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextofElement(By by) {
        driver.findElement(by).getText();
        return driver.findElement(by).getText();
    }

    // @AfterMethod
    public static void closeBrowser() {
        driver.quit();
    }

    @Test
    public static void verifyThatUserisAbletoRegisterSuccessfully() {//Type URL
        driver.get("https://demo.nopcommerce.com/");
        //Click on Register
        findByElement(By.className("ico-register"));

        //Enter First Name
        findText(By.id("FirstName"), "Shivam");

        //Enter Last Name
        findText(By.id("LastName"), "Dube");

        //Enter Email id
        findText(By.id("Email"), "shivamdube@gmail.com");

        //Enter Password
        findText(By.id("Password"), "Ipl2024");

        //Confirm Password
        findText(By.id("ConfirmPassword"), "Ipl2024");

        //Click on Register Button
        findByElement(By.id("register-button"));

    }

    @Test
    public static void toVerifyThatUserIsAbleLoginSuccessfully() {

        //Click on Login Button
        findByElement(By.className("ico-login"));

        //Enter Email id
        findText(By.id("Email"), "shivamdube@gmail.com");

        //Enter Password
        findText(By.id("Password"), "Ipl2024");

        //Click on Login
        findByElement(By.xpath("//button[@class ='button-1 login-button']"));

        //Click on Electronics
        findByElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

        //Click on Camera & Photo
        findByElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[1]/a"));

        //Click on Camera & Photo
        findByElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a"));

        //Click on Email a Friend
        findByElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button"));

        //Enter Friends Email
        findText(By.id("FriendEmail"), "softwaretesterKumar@gmail.com");

        //Enter own Email id
        findByElement(By.id("YourEmailAddress"));

        //Enter your message
        findText(By.id("PersonalMessage"), "Have a look at this camera, you will love it");

        //Click on Send Email
        findByElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button"));

        //Comparison of Expected msg with Actual msg


        getTextofElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]"));
        String Actualmsg = getTextofElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]"));
        Assert.assertEquals(Actualmsg, Expectedmsg, "Your message has been sent");
    }



    //SORRY NOT ABLE TO FIND A SOLUTION FOR THE 3rd PART




  //  @Test
    //public static void verifyThatAlltheProductsHaveAddtoCartButton()
    //{
        //Click on Electronics
      //  findByElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

        //Click on Camera & Photo
        //findByElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[1]/a"));

        //Click on Add to cart Button of NikonD550 DSLR
        //findByElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]"));


    }

