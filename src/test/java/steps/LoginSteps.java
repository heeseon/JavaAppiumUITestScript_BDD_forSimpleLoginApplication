package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginSteps {

    private AndroidDriver driver;
    By userId;
    By password;
    By login_Button;
    By result;
    	
    public LoginSteps() {
    }

   //자동화 테스트 전처리
    @Before
    public void initializeAppiumSession() throws MalformedURLException{
        File appDir = new File("/Users/hwangheeseon/Downloads/AppiumCucumberDemo/apps");
        File app = new File(appDir, "app-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        //capabilities.setCapability("automationName", "Selendroid");
        capabilities.setCapability("platformName","Android");

        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
    
    //Given Anotation, ^와  $는 스텝 구문을 감싸는 문법
    @Given("^I am on the landing page$")
    public void I_am_on_the_landing_page() throws Throwable {
    
    	// String app_package_name = "com.example.swipetest:id/";
        userId = By.id("idET");
        password = By.id("pwdET");
        login_Button = By.id("login");

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(userId));
    }
    
    //When Anotation
    @When("^I enter id as \"([^\"]*)\"$")
    public void I_enter_id_as(String ID) throws Throwable {
        driver.findElement(userId).sendKeys(ID);
        driver.hideKeyboard();
    }

    //When Anotation
    @When("^I enter password as \"([^\"]*)\"$")
    public void I_enter_password_as(String PW) throws Throwable {
        driver.findElement(password).sendKeys(PW); 
        driver.hideKeyboard();
    }
    
    //When Anotation
    @When("^I click login button$")
    public void I_click_login_button() throws Throwable {
        driver.findElement(login_Button).click(); 
    }
    
    //Then Anotation
    @Then("^I should see the success message \"([^\"]*)\"$")
    public void I_should_see_the_success_message(String success) throws Throwable {
    	result = By.id("result");
    	WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(result));
        success.contentEquals(driver.findElement(result).getText());
    }

    //테스트 후처리
    @After
    public void tearDown(){
    	driver.quit();
    }
}
