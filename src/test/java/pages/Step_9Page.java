package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.anhtester.keywords.WebUI;
import com.anhtester.projects.cms.CommonPageCMS;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;


public class Step_9Page extends CommonPageCMS {
	
//	public 	WebDriver driver;
	
	
	
//	@FindBy(id = "applicationButton")
	private By ApplicationModule1 = By.id("applicationButton");	
	
//	@FindBy(xpath = "//span[.='Step 8: Upload Application ']")
	private By Upload_Application = By.xpath("//span[.='Step 8: Upload Application ']");
	
	private By List_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");

//	@FindBy(xpath = "(//ion-col[@size='24' and@size-md='18' ]/ion-button[@class = 'md button button-solid ion-activatable ion-focusable hydrated'])[13]")
	private By Table_Of_Content = By.xpath("(//ion-col[@size='24' and@size-md='18' ]/ion-button[@class = 'md button button-solid ion-activatable ion-focusable hydrated'])[13]");
	
//	@FindBy(xpath = "(//td/ion-button[@title='Edit Application'])[last()]")
	private By ListEdit_application1 = By.xpath("(//td/ion-button[@title='Edit Application'])[last()]");
	

    public void Edit_Submit() throws Exception 
    {
    	
//		Thread.sleep(2000);
    	WebUI.waitForPageLoaded(2);
//		ApplicationModule1.click();
    	WebUI.clickElement(ApplicationModule1);
		WebUI.sleep(2);
		
//		WebElement List_application1=driver.findElement(By.xpath("//div[@class='applicationDropdown']/div[1]")); //==== Commented Previously ======>>
		
//		Thread.sleep(2000);
//		List_application1.click();
		WebUI.clickElement(List_application1);
		WebUI.sleep(2);
		
//		Actions act =new Actions(driver);
//		act.scrollToElement(ListEdit_application1).build().perform();
		WebUI.scrollToElementAtBottom(ListEdit_application1);
		WebUI.sleep(1);
		WebUI.verifyElementVisible(ListEdit_application1,2);

//		ListEdit_application1.click();
		WebUI.clickElement(ListEdit_application1,2);
		WebUI.sleep(1);
		
//    	Upload_Application.click();
    	WebUI.clickElement(Upload_Application, 2);
		WebUI.sleep(5);
		
//		ListEdit_application1.click(); ======= Commented Previously ===========>>
//		Thread.sleep(4000);
		
    }
    
}
