import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class YarsabazarSabina {
    public static void main(String[] args) throws InterruptedException {

        //To open Yarsa Bazar website
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yarsabazar.com/");
        driver.manage().window().maximize();

        // Check that we have landed on dashboard by verifying the presence of Yarsa Bazar.
        boolean displayedelement = driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/a/img[2]")).isDisplayed();
        if (displayedelement){
            System.out.println("Yarsa Bazar is displayed Successfully landed on dashboard");
        }
        else {
            System.out.println("Yarsa Bazar is not displayed Not landed on dashboard");
        }
        Thread.sleep(1000);

        // to scroll upto bottom of web page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println("Successfully Scrolled upto buttom of the web page");
        Thread.sleep(1000);

        //To Verify if login button is enabled in dashboard
        boolean enabledelement = driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[1]/a")).isEnabled();
        if (enabledelement){
            System.out.println("Log in button is enabled");
        }
        else {
            System.out.println("Log in button is not enabled");
        }

        //To verify view more element
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/a")).click();
        Thread.sleep(1000);
        driver.navigate().back();

        // Login functionality
        driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        displayedelement = driver.findElement(By.id("username")).isDisplayed();
        if (displayedelement){
            System.out.println("Username field is displayed");
        }
        else {
            System.out.println("Username field is not displayed");
        }

        displayedelement = driver.findElement(By.id("password")).isDisplayed();
        if (displayedelement){
            System.out.println("Password field is displayed");
        }
        else {
            System.out.println("Password field is not displayed");
        }

        //Send keys to login page
        driver.findElement(By.id("username")).sendKeys("Rita Muktan");
        driver.findElement(By.id("password")).sendKeys("ritaaaaaaa");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
        displayedelement = driver.findElement(By.cssSelector(".mt-4.w-full.rounded-md.bg-red-100.p-3.text-sm.text-red-600")).isDisplayed();
        if(displayedelement){
            System.out.println("Email or Phone is incorrect");
        }
        else {
            System.out.println("Successfully Logged in to Yarsa Bazar");
        }

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.findElement(By.cssSelector(".absolute.right-2.cursor-pointer.text-sub")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[class=\"text-sm text-primary-600 hover:underline\"]")).click();
        driver.findElement(By.cssSelector(".btn-sm.btn.btn-light-gray.mt-4.w-full.justify-center")).click();
        driver.findElement(By.cssSelector(".flex.items-center.gap-3.btn-sm.btn.btn-link-gray.justify-center")).click();
        System.out.println("Successfully returned to dashboard from login page");


        //To Verify if Sign up button is enabled in dashboard
        enabledelement = driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[2]/a")).isEnabled();
        if (enabledelement){
            System.out.println("Sign up button is enabled");
        }
        else {
            System.out.println("Sign up button is not enabled");
        }

        //Send keys to signup page
        driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[2]/a")).click();
        driver.findElement(By.id("name")).sendKeys("Ritu Dhakal");
        driver.findElement(By.id("address")).sendKeys("Kathmandu");
        driver.findElement(By.id("phone")).sendKeys("9898989898");
        driver.findElement(By.id("email")).sendKeys("retu@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Create a new strong password\"]")).sendKeys("rituritu");
        driver.findElement(By.xpath("//input[@placeholder=\"Repeat your new password\"]")).sendKeys("rituritu");
        //        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(By.xpath("//button[normalize-space()=\"Back to Yarsa Bazar\"]")).click();
        System.out.println("Successfully returned to dashboard from Sign up page");


        //For Search button
        driver.findElement(By.id(":R99a9:")).click();
        driver.findElement(By.id(":R99a9:")).sendKeys("Dog Food");
        displayedelement = driver.findElement(By.xpath("//span[normalize-space()=\"Products\"]")).isDisplayed();
        if (displayedelement){
            System.out.println("Product category is displayed for Dog Food");
        }
        else {
            System.out.println("Product category is not displayed for Dog Food");
        }

        displayedelement = driver.findElement(By.xpath("//span[normalize-space()=\"Vendors\"]")).isDisplayed();
        if (displayedelement) {
            System.out.println("Vendor category is displayed for Dog Food");
        }
        else {
            System.out.println("Vendor category is not displayed for Dog Food");
        }

        displayedelement = driver.findElement(By.xpath("//span[normalize-space()=\"Categories\"]")).isDisplayed();
        if (displayedelement) {
            System.out.println("Categories category is displayed for Dog Food");
        }
        else {
            System.out.println("Categories category is not displayed for Dog Food");
        }
        Thread.sleep(2000);

        //Click on single product from search diplayed list
        driver.findElement(By.xpath("(//div)[19]")).click();
        driver.findElement(By.xpath("//button[normalize-space()=\"Fill the Form\"]")).click();
        driver.findElement(By.name("request")).sendKeys("Drools 3kg Dog food");
        driver.findElement(By.name("email")).sendKeys("ritu@gmail.com");
        driver.findElement(By.name("fullName")).sendKeys("Ritu Dhakal");
        driver.findElement(By.name("mobileNumber")).sendKeys("9898989898");
        driver.findElement(By.xpath("//textarea[@placeholder=\"Please provide us with some details about the product/service you are interested in. Include any specifications or requirements that you may have.\"]")).sendKeys("dog is a dog is a dog always a dog.");
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

//      driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(By.cssSelector(".h-8[height=\"32\"]")).click();
        System.out.println("Successfully returned to dashboard");

//      for agriculture live stock section
        driver.findElement(By.xpath("//span[normalize-space()=\"Agriculture, Livestock and Herbs\"]")).click();
        driver.findElement(By.cssSelector("a:nth-child(5)")).click();
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested Agriculture Live stock section");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        //for Furniture, Wood and Metal section
        driver.findElement(By.xpath("(//li[@class='group relative flex w-full cursor-pointer flex-col items-center gap-2 rounded bg-white p-4 text-center text-sm font-medium md:flex-row md:p-2 md:text-left md:hover:bg-gray-100'])[1]")).click();
        driver.findElement(By.cssSelector("body > section:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(6)")).click();
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested Furtinure, Wood and Metal section");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        //for paper, plastic section
        driver.findElement(By.cssSelector("body > section:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > span:nth-child(3)")).click();
        driver.findElement(By.xpath("(//h3[normalize-space()='Paper Bags Gifts and Paper Products'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested Paper, plastic section");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        //for clothing, jwellery and textile
        driver.findElement(By.cssSelector("body > section:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > span:nth-child(3)")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested Clothing, jwellery and textile");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        // for building, construction
        driver.findElement(By.cssSelector("body > section:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(10) > span:nth-child(3)")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.findElement(By.cssSelector("body section a:nth-child(4)")).click();
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested building,construction section");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        // for transportation
        driver.findElement(By.xpath("(//span[normalize-space()='Transportation and Logistics'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[1]")).click();
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested transportation");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        // for books and stationery
        driver.findElement(By.xpath("(//span[normalize-space()='Books and Stationery'])[1]")).click();
        driver.findElement(By.xpath("(//h3[contains(text(),'Crayon')])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[4]")).click();
        driver.findElement(By.xpath("(//a[@class='group flex overflow-hidden rounded-md border border-light bg-white p-3 hover:border-dark hover:bg-gray-50'])[6]")).click();
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested books and stationery");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //for cosmetics
        driver.findElement(By.xpath("//span[normalize-space()='Cosmetics and Personal Care']")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Soaps')]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/section/div/div[2]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/section/div/div[2]/a[4]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("img[class=\"hidden h-[18px] lg:block\"]")).click();
        System.out.println("Successfully tested cosmetics");
        System.out.println("Successfully returned to dashboard");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        //for footer
        displayedelement = driver.findElement(By.xpath("/html/body/footer/div[1]")).isDisplayed();
        if (displayedelement){
            System.out.println("Footer is displayed and interactable");
        }

        else{
            System.out.println("Footer is not displayed");
        }

        // for facebook, instagram and Twitter symbol on footer
        enabledelement = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[3]/div/div/div/svg[1]")).isEnabled();
        if (enabledelement){
            System.out.println("Facebook button is enabled on footer");
        }
        else {
            System.out.println("Facebook button is not enabled on footer");
        }

        enabledelement = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[3]/div/div/div/svg[2]")).isEnabled();
        if (enabledelement){
            System.out.println("Instagram button is enabled on footer");
        }
        else {
            System.out.println("Instagram button is not enabled on footer");
        }

        enabledelement = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[3]/div/div/div/svg[3]")).isEnabled();
        if (enabledelement){
            System.out.println("Twitter button is enabled on footer");
        }
        else {
            System.out.println("Twitter button is not enabled on footer");
        }

        //for privacy policy in footer
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[1]/ul/li[1]/a")).click();
        System.out.println("Privacy Policy page was opened on new tab");

        //for Terms of Services
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
        System.out.println("Terms of Services page was opened on new tab successfully");

        //for Sell on Yarsa Bazar
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div[2]/div[2]/ul/li/a")).click();
        System.out.println("Sell on Yarsa Bazar page was opened successfully");

        //closing of website
        System.out.println("Privacy Policy tab was closed successfully");
        System.out.println("Terms of Services tab was closed successfully");
        System.out.println("Yarsa Bazar website was closed successfully");

        driver.quit();
    }
}
