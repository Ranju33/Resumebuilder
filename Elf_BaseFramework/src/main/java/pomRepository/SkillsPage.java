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
public class SkillsPage {
	public SkillsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Skills
		@FindBy(xpath="//button[text()='Skills']")
		private WebElement skills;
		
		@FindBy(xpath="//input[@placeholder='Frontend Technologies']")
		private WebElement frontEndSkills;
		
		@FindBy(xpath="//li[text()='HTML']")
		private WebElement HTMLSkill;
		
		@FindBy(xpath="//input[@placeholder='Backend Technologies']")
		private WebElement backEndSkills;
		
		@FindBy(xpath="//li[text()='Java 1.8']")
		private WebElement javaSkill;


		public WebElement getSkills() {
			return skills;
		}

		public WebElement getFrontEndSkills() {
			return frontEndSkills;
		}

		public WebElement getBackEndSkills() {
			return backEndSkills;
		}

		public WebElement getHTMLSkill() {
			return HTMLSkill;
		}

		public WebElement getJavaSkill() {
			return javaSkill;
		}

}
