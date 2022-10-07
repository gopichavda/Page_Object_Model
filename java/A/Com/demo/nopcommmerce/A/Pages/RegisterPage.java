package A.Com.demo.nopcommmerce.A.Pages;

import org.jcp.xml.dsig.internal.dom.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.security.util.Password;

public class RegisterPage {

    WebDriver driver;
    Utils utils;

    By Registerlink = By.className("ico-register");
    By FirstName = By.xpath("//*[@id=\"FirstName\"]");
    By LastName = By.xpath("//*[@id=\"LastName\"]");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    By RegisterButton = By.id("register-button");

    public RegisterPage(WebDriver driver){
        this.driver=driver;
        Utils  = new Utils(driver);
        public void clickonRegisterClick(){
            Utils.doClick(Registerlink);}
    }
}
