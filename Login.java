package vtiger;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver cd=new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.get("https://demo.vtiger.com/vtigercrm/index.php");
		cd.findElement(By.id("username"));
		cd.findElement(By.id("password"));
		cd.findElement(By.xpath("//Button[text()='Sign in']")).click();
	//	Thread.sleep(2000);
		cd.findElement(By.id("appnavigator")).click();
	//	Thread.sleep(2000);
		WebElement ele = cd.findElement(By.xpath("//span[text()=' MARKETING']"));
	//	Thread.sleep(2000);
		Actions action = new Actions(cd);
		action.moveToElement(ele).perform();
		
	//	Thread.sleep(2000);
	    
	//	cd.findElement(By.name("module-name textOverflowEllipsis")).click();
		cd.findElement(By.xpath("//span[text()=' Contacts']")).click();
		
		
		cd.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("kunal");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("mote");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("1234567890");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("9021780084");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("8669365248");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("8830086645");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("java");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("computer");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("hello");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("kunalmote16@gmail.com");
	//	Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("testing");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("8975690069");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("motekunal@gmail.com");
	//	Thread.sleep(2000);
	   cd.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_donotcall']")).click();		
	//	Thread.sleep(2000);
		cd.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_emailoptout']")).click();
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_reference")).click();
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_portal")).click();
	//	Thread.sleep(2000);
		cd.findElement(By.name("mailingstreet")).sendKeys("pune");
	//	Thread.sleep(2000);
		cd.findElement(By.name("otherstreet")).sendKeys("pusad");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("123");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("456");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("deccan");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("pusad");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("maharashtra");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("maharashtra");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("441510");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("445204");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("india");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("india");
	//	Thread.sleep(2000);
 		cd.findElement(By.xpath("//textarea[@name='description']")).sendKeys("king of java");
		
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_support_end_date")).clear();
		cd.findElement(By.id("Contacts_editView_fieldName_support_end_date")).sendKeys("22-04-2023");
	//	Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_support_start_date")).clear();
//		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_support_start_date")).sendKeys("29-05-2021");
	//    Thread.sleep(2000);
		cd.findElement(By.xpath("//Button[text()='Save']")).click();
//		Thread.sleep(2000);
		cd.findElement(By.cssSelector("span[title='Atlas Jeniffer(admin)']")).click();
//		Thread.sleep(2000);
       cd.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		//cd.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
