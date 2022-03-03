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

public class DownloadPage {
	public DownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[text()='Include Profile pic']/..//input[@class='checkBox']")
	private WebElement profilePic;
	
	@FindBy(xpath="//button[text()='Download as']")
	private WebElement download;
	
	@FindBy(xpath="//button[text()='PDF']")
	private WebElement pdf;
	
	@FindBy(xpath="//button[text()='WORD']")
	private WebElement word;
	
	@FindBy(xpath="//input[@src='/static/media/Template2.1eb122f1.PNG']")
	private WebElement differentTemplate;

	public WebElement getProfilePic() {
		return profilePic;
	}

	public WebElement getDownload() {
		return download;
	}

	public WebElement getPdf() {
		return pdf;
	}

	public WebElement getWord() {
		return word;
	}

	public WebElement getDifferentTemplate() {
		return differentTemplate;
	}
	
}
