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
public class SummaryPage {
	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Summary Module

		@FindBy(xpath="//button[text()='Summary']")
		private WebElement summary;
		
		@FindBy(xpath="//div[@class='input-data']")
		private WebElement summaryText;

		public WebElement getSummary() {
			return summary;
		}

		public WebElement getSummaryText() {
			return summaryText;
		}	

}
