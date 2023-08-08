package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "manage_spares")
	WebElement manageSpare;

	@FindBy(id = "create_spares_request")
	WebElement spareRequestOption;

	public void clickOnManageSpare() {

		Actions a = new Actions(driver);
		a.moveToElement(manageSpare).click().build().perform();
	}

	public void clickonSpareRequest() {
		spareRequestOption.click();
	}
}
