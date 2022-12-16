package week3.day4.assesmant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
 public static void main(String[] args) {
	
	    ChromeDriver drive=new ChromeDriver();
		
		drive.get("https://www.tamilmatrimony.in/");
		
		drive.manage().window().maximize();
		
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(530));
		
		WebElement mprofile = drive.findElement(By.xpath("//select[@name='REGISTERED_BY']"));
		
		Select mprofileDropdown= new Select(mprofile);
		
		mprofileDropdown.selectByVisibleText("Myself");
		
		drive.findElement(By.id("NAME")).sendKeys("Baskar");
		
		drive.findElement(By.id("gendermale")).click();
		
		WebElement Date = drive.findElement(By.xpath("//select[@name='DOBDAY']"));
		
		Select DateDropDown=new Select(Date);
		
		DateDropDown.selectByIndex(20);
		
		WebElement Month = drive.findElement(By.xpath("//select[@name='DOBMONTH']"));
		
		Select MonthDropDown= new Select(Month);
		
		MonthDropDown.selectByVisibleText("June");
		
        WebElement Year = drive.findElement(By.xpath("//select[@name='DOBYEAR']"));
		
		Select YearDropDown= new Select(Year);
		
		YearDropDown.selectByValue("2000");
		
		WebElement Religion = drive.findElement(By.id("RELIGION"));
		
		Select ReligionDropDown = new Select(Religion);
		
		ReligionDropDown.selectByVisibleText("Hindu");
		
		WebElement Country = drive.findElement(By.id("COUNTRY")); 
		
		Select CountryDropDown = new Select(Country);

		CountryDropDown.selectByVisibleText("India");
        
		WebElement CountryCode = drive.findElement(By.xpath("//select[@name='M_COUNTRYCODE']"));
		
		Select CountryCodeDropDown = new Select(CountryCode);

		CountryCodeDropDown.selectByVisibleText("+91");
		
		drive.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9080556404");
		
		
		drive.findElement(By.name("EMAIL")).sendKeys("bsedhupathi@gmail.com");
		
		WebElement MotherTounge =drive.findElement(By.xpath("//select[@name='MOTHERTONGUE']"));
		
		Select MotherToungeDropDown = new Select(MotherTounge);
		
		MotherToungeDropDown.selectByVisibleText("Tamil");
		
		
		
		
		
		drive.findElement(By.id("PASSWORD")).sendKeys("asDHJ1263#");
		
		
		
 
 
 
 }
}
