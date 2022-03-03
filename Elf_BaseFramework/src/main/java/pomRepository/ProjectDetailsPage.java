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
public class ProjectDetailsPage {
	public ProjectDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//ProjectDetails
	@FindBy(xpath="//label[text()='Project Name']")
	private WebElement projectName;
	
	@FindBy(xpath="//button[text()='ProjectDetails']")
	private WebElement projectDetails;
	
	@FindBy(xpath="//input[@placeholder='Frontend Technologies']")
	private WebElement frontendTechnologies;
	
	@FindBy(xpath="//li[text()='HTML']")
	private WebElement HTMLfrontend;
	
	@FindBy(xpath="//input[@placeholder='Backend Technologies']")
	private WebElement backendTechnologies;
	
	@FindBy(xpath="//li[text()='Java 1.8']")
	private WebElement javaBackend;

	public WebElement getProjectDetails() {
		return projectDetails;
	}

	public WebElement getFrontendTechnologies() {
		return frontendTechnologies;
	}

	public WebElement getHTMLfrontend() {
		return HTMLfrontend;
	}

	public WebElement getBackendTechnologies() {
		return backendTechnologies;
	}

	public WebElement getJavaBackend() {
		return javaBackend;
	}
}
