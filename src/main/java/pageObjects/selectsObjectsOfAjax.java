package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectsObjectsOfAjax {
	
	WebDriver driver;
	//created a constructor 
	public selectsObjectsOfAjax (WebDriver driver) 
	{
		this.driver=driver;
		//Initializing FindBy annotations
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="#Content_DemoContent_GridView1_Label1_2")
	WebElement designProduct;
	
	//@FindBy(css="#Content_DemoContent_GridView1_LinkButton1_3")
	@FindBy(id = "Content_DemoContent_GridView1_LinkButton1_2")
	WebElement editLink;
	
   
	@FindBy(id="Content_DemoContent_GridView1_TextBox3_2")
	WebElement pritextbox;
	
	@FindBy(id="Content_DemoContent_GridView1_LinkButton1_2")
	WebElement updateLink;
	
	
	
	
	public WebElement designProduct()
	{
		return designProduct;
	}
	public WebElement editLink()
	{
		return editLink;
	}
	public WebElement priTextbox()
	{
		return pritextbox;
	}
	
	public WebElement updateLink()
	{
		return updateLink;
	}
	
}
