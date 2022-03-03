package skills;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.DownloadPage;
import pomRepository.EducationPage;
import pomRepository.ProfilePage;
import pomRepository.ProjectDetailsPage;
import pomRepository.SkillsPage;
import pomRepository.SummaryPage;
/***
 * 
 * @author ranjitha kp
 *
 */

public class TC_Education_001Test extends Base_Class{

	@Test
	public void Education() {

		String FirstName = excelLib.readStringDataFromExcel("Sheet1", 0, 0);
		String LastName = excelLib.readStringDataFromExcel("Sheet1", 0, 1);
		String Summary = excelLib.readStringDataFromExcel("Sheet1", 0, 2);
		double passOutYear = excelLib.readNumberDataFromExcel("Sheet1", 0, 3);
		double Percentage = excelLib.readNumberDataFromExcel("Sheet1", 0, 4);

		Assert.assertEquals(driver.getTitle(),excelLib.readStringDataFromExcel("Sheet1",0,5),"Home page is not displayed");
		Reporter.log("Home page is displyed",true);

		ProfilePage profile=new ProfilePage(driver);
		Assert.assertEquals(profile.getProfilePage().getText(), excelLib.readStringDataFromExcel("Sheet1",0,6),"Profile Page is not displayed");
		Reporter.log("Profile page is displyed",true);
		WebElement Firstname = profile.getProfileFirstname();
		Firstname.clear();
		Firstname.sendKeys(FirstName);
		WebElement lastName = profile.getProfileLastname();
		lastName.clear();
		lastName.sendKeys(LastName);
		profile.getProfileTechnology().click();
		profile.getProfileTechnologyNode().click();

		SummaryPage summary=new SummaryPage(driver);
		Assert.assertEquals(summary.getSummary().getText(), excelLib.readStringDataFromExcel("Sheet1",0,7),"Summary Page is not displayed");
		Reporter.log("Summary page is displyed",true);
		summary.getSummary().click();
		summary.getSummaryText().click();
		Actions action=new Actions(driver);
		action.sendKeys(Summary).click().perform();

		SkillsPage skills=new SkillsPage(driver);
		Assert.assertEquals(skills.getSkills().getText(), excelLib.readStringDataFromExcel("Sheet1",0,8),"Skills Page is not displayed");
		Reporter.log("Skills page is displyed",true);
		skills.getSkills().click();
		skills.getFrontEndSkills().click();
		skills.getHTMLSkill().click();
		skills.getBackEndSkills().click();
		skills.getJavaSkill().click();	

		EducationPage education = new EducationPage(driver);
		Assert.assertEquals(education.getEducationbutton().getText(), excelLib.readStringDataFromExcel("Sheet1",0,9),"Education Page is not displayed");
		Reporter.log("Education page is displyed",true);
		education.getEducationbutton().click();
		WebElement highestEducation =education.getHighestEducation();
		Select select=new Select(highestEducation);
		select.selectByValue("0");
		WebElement specialization = education.getSpecialization();
		Select Specialization=new Select(specialization);
		Specialization.selectByValue("88");
		WebElement university = education.getUniversity();
		Select University=new Select(university);
		University.selectByValue("6");
		WebElement PassoutYear=education.getPassOutYear();
		PassoutYear.click();
		PassoutYear.sendKeys(""+passOutYear);
		WebElement percentage = education.getPercentage();
		percentage.click();
		percentage.sendKeys(""+Percentage);

		ProjectDetailsPage projectDetails=new ProjectDetailsPage(driver);
		Assert.assertEquals(projectDetails.getProjectDetails().getText(), excelLib.readStringDataFromExcel("Sheet1",0,10),"Project Details Page is not displayed");
		Reporter.log("Project Details page is displyed",true);
		projectDetails.getProjectDetails().click();
		projectDetails.getFrontendTechnologies().click();
		projectDetails.getHTMLfrontend().click();
		projectDetails.getBackendTechnologies().click();

		DownloadPage download=new DownloadPage(driver);
		download.getProfilePic().click();
		Assert.assertEquals(download.getDownload().getText(), excelLib.readStringDataFromExcel("Sheet1",0,11),"Download not Successfully in PDF formate");
		Reporter.log("Download Successfully in PDF farmate",true);
		download.getDownload().click();
		download.getPdf().click();
		
	}
}
