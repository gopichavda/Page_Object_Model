package A.Com.demo.nopcommmerce.A.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

    WebDriver driver;
    Properties prop;
    FileInputStream file;

    public WebDriver initialiseDriver(String browserName ){
        if (browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browserName.equals("Edge")){
            WebDriverManager.chromedriver().setup();
            driver = new EdgeDriver();
        }else if (browserName.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            System.out.println("browser not matched");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;
    }

    public Properties intialiseProperties(){
         prop = new Properties();
         try {
              file = new FileInputStream("C:\\Users\\YASHPALSINH CHAVDA\\IdeaProjects\\Page_Object_Model\\src\\test\\resources\\Test Data\\Config.properties");
              prop.load(file);
         }catch (FileNotFoundException e){
             System.out.println("Config file is not found...Please check");
             e.printStackTrace();
         }catch (IOException e){
             System.out.println("properties could not be loded");
         }
         return prop;
    }
}
