package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author ranjitha kp
 *
 */
public class ProfilePage {
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Profile Element
	@FindBy(xpath="//button[text()='Profile']")
	private WebElement profilePage;
	
	public WebElement getProfilePage() {
		return profilePage;
	}
	@FindBy(xpath="//input[@value='FirstName']")
	private WebElement profileFirstname;

	@FindBy(xpath="//input[@value='LastName']")
	private WebElement profileLastname;

	@FindBy(id="Technology")
	private WebElement profileTechnology;

	@FindBy(xpath="//option[text()='Node JS']")
	private WebElement profileTechnologyNode;

	public WebElement getProfileFirstname() {
		return profileFirstname;
	}

	public WebElement getProfileLastname() {
		return profileLastname;
	}

	public WebElement getProfileTechnology() {
		return profileTechnology;
	}
	public WebElement getProfileTechnologyNode() {
		return profileTechnologyNode;
	}	
}

