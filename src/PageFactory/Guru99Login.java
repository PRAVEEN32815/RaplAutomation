package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login {
	
    WebDriver drive;

    @FindBy(name="uid")
    WebElement user99GuruName;

    @FindBy(name="password")
    WebElement password99Guru;    

    @FindBy(className="barone")
    WebElement titleText;

    @FindBy(name="btnLogin")
    WebElement login;

    public  Guru99Login(WebDriver drive1){
        this.drive = drive1;
        PageFactory.initElements(drive1, this);
    }
    
    public void loginWithEmailAndPassword() {
    	String strUserName = "mgr123";
    	String strPassword = "mgr!23";
    	
    	user99GuruName.sendKeys(strUserName);     
    	password99Guru.sendKeys(strPassword);
        login.click();
    }

}
