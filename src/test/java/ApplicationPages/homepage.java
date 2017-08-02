package ApplicationPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {
	
    WebDriver driver;
    
public homepage(WebDriver ldriver){
		
		this.driver = ldriver;
		
	}
    @FindBy(xpath = "//span[@class='hidden-xs'][text()='Home']") 
	WebElement  HomeLink;
	
	@FindBy(xpath="//span [text()= 'My Account']")
	WebElement MyAccountLink;
	
	@FindBy(xpath="//span [text()= 'My Cart']")
	WebElement  MyCartLink;
	
	@FindBy(xpath="//span [text()= 'Wishlist']")
	WebElement  Wishlistlink;
	
	@FindBy(xpath="//span[text()= ' Log In']")
	WebElement  loginLink;
	
	public void clickonLoginlink(){
		loginLink.click();	
		
	}
	
	public void clickonHomeLink(){
		HomeLink.click();	
		
	}
	
	public void clickonMyAccountLink(){
		MyAccountLink.click();	
		
	}
	public void clickonMyCartLink(){
		MyCartLink.click();	
		
	}
	
	 
    public String getApplicationTitle(){
    	
    	return (driver.getTitle());
	

    }
	

}
