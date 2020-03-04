package AjaxControlToolkit;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.selectsObjectsOfAjax;
import resources.base;

public class AjaxApplication extends base{
	
	@Test
	public void HoverMenu() throws IOException
	{
	driver = initializeDriver();
	
	
	selectsObjectsOfAjax sobj = new selectsObjectsOfAjax(driver);
	
	//Hover over design product in the table and click Edit in the popup menu

	Actions a = new Actions(driver);
	a.moveToElement(sobj.designProduct()).build().perform();
	sobj.editLink().click();
	
	//Update the Pri value and click update in menu

	sobj.priTextbox().clear();
	sobj.priTextbox().sendKeys(pro.getProperty("price"));
	String pricevalue = sobj.priTextbox().getAttribute("value");
	a.moveToElement(sobj.priTextbox()).build().perform();
	sobj.updateLink().click();
	
	//Verify the pri value has been updated in the table
	Assert.assertEquals(pro.getProperty("price"),pricevalue);

		
	}

}
