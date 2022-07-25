package libraryCT.pages;

import libraryCT.utilities.BrowserUtilities;
import libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type='email']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(css = "button[type='submit']")
    public WebElement signInBtn;

    public String getTitle(){
        return Driver.getDriver().getTitle();
    }

    public void login(String librarian, String librarianPassword){
        inputUserName.sendKeys(librarian);
        inputPassword.sendKeys(librarianPassword);
        BrowserUtilities.waitFor(2);
        signInBtn.click();
    }


}
