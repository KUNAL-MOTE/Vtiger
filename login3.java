package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 ChromeDriver cd=new ChromeDriver();
         Actions A = new Actions(cd);
		 cd.get("https://demo.vtiger.com/vtigercrm/index.php");
	 
		 cd.findElement(By.id("username")); 
		
		cd.findElement(By.id("password"));
		
		cd.findElement(By.xpath("//Button[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("appnavigator")).click();
		Thread.sleep(1000);
		
		WebElement ele= cd.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions action=new Actions(cd);
		action.moveToElement(ele).perform();	
		
		
		Thread.sleep(1000);
		cd.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
	
		
//		cd.findElement(By.id("appnavigator")).click();
//		Thread.sleep(2000);
//		 
//		WebElement ele3 = cd.findElement(By.xpath("//span[text()=' MARKETING']"));
//		Actions action3 = new Actions(cd);
//		action3.moveToElement(ele3).perform();
//		Thread.sleep(2000);
//		
//		cd.findElement(By.xpath("//span[text()=' Organizations'])[1]")).click();
//	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("kunal");
	    Thread.sleep(2000);

	    cd.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("kunal.com");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7756481351");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("{ k }");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("k_A_S");
	    Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("4564789812");
		Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("1000");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("shubham1@gmail.com");
	    Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("vivek@gmail.com");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("java");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("k128");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)cd;
		jse.executeScript("window.scrollBy(0,300)");
		cd.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("12450000");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.name("bill_street")).sendKeys("pusad");
		Thread.sleep(2000);
		
		cd.findElement(By.name("ship_street")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("256");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("144");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("goa");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("Oops");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("Q-spider");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("J-spider");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("ind");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("ind");
		Thread.sleep(2000);
		
		cd.findElement(By.name("description")).sendKeys("do study........");
		Thread.sleep(2000);

		cd.findElement(By.xpath("//Button[text()='Save']")).click();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("span[title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
        cd.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}

}
