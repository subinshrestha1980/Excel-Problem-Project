
package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Contactsvalidation extends BasePage {

	WebDriver driver;

	public void ListCustomerContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"application_ajaxrender\"]/a")
	WebElement ValidationSummary;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "List Customers")
	WebElement LIST_CUSTOMER_BUTTON;

	public void Summary_Field() {
		waitforElement(driver, 10, ValidationSummary);
		System.out.println(ValidationSummary.getText());
		Assert.assertEquals(ValidationSummary.getText(), " Create Auto Login URL", "Create Auto Login URL not found");
		
		}
	public void LIST_CUSTOMER() {
		waitforElement(driver, 15, LIST_CUSTOMER_BUTTON);
		LIST_CUSTOMER_BUTTON.click();
	}
}
