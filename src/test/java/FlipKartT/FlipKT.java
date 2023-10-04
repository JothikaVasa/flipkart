package FlipKartT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FlipKT {

    private FirefoxDriver dr;

    @BeforeClass
    public void setUp() {
        dr = new FirefoxDriver();
        dr.get("https://www.flipkart.com");
        dr.manage().window().maximize();
    }

    @Test
    public void searchAndAddToCart() throws InterruptedException {
        dr.findElement(By.cssSelector("._30XB9F")).click();
        WebElement searchBox = dr.findElement(By.name("q"));
        searchBox.sendKeys("Smart Watch");
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        dr.navigate().to("https://www.flipkart.com/noise-colorfit-icon-2-1-8-display-bluetooth-calling-ai-voice-assistant-smartwatch/p/itmfa97e2fcabed9?pid=SMWGEH7VGYMGCP3V&lid=LSTSMWGEH7VGYMGCP3VXIJHDY&marketplace=FLIPKART&q=Smart+Watch&store=ajy%2Fbuh&spotlightTagId=BestsellerId_ajy%2Fbuh&srno=s_1_3&otracker=search&otracker1=search&fm=Search&iid=9d57dc90-a88b-4232-b33c-ef35bd861a19.SMWGEH7VGYMGCP3V.SEARCH&ppt=sp&ppn=sp&ssid=508p3y2v6jkozoqo1696431392022&qH=182a0e44af51ce7d");
        WebElement addToCart = dr.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
        addToCart.click();
        Thread.sleep(5000);
        WebElement placeOrder = dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button"));
        placeOrder.click();
    }

    @AfterClass
    public void tearDown() {
        dr.quit();
    }
}




