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

public class EducationPage {
	public EducationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Education
		@FindBy(xpath="//button[text()='Education']")
		private WebElement educationbutton;
		
		@FindBy(id="Highest Education")
		private WebElement highestEducation;
		
		@FindBy(id="Specialization")
		private WebElement specialization;
		
		@FindBy(id="University")
		private WebElement university;
		
		@FindBy(xpath="//input[@max='2040']")
		private WebElement passOutYear;
		
		@FindBy(xpath="//input[@max='100']")
		private WebElement percentage;

		public WebElement getEducationbutton() {
			return educationbutton;
		}

		public WebElement getHighestEducation() {
			return highestEducation;
		}

		public WebElement getSpecialization() {
			return specialization;
		}

		public WebElement getUniversity() {
			return university;
		}

		public WebElement getPassOutYear() {
			return passOutYear;
		}

		public WebElement getPercentage() {
			return percentage;
		}	
}

